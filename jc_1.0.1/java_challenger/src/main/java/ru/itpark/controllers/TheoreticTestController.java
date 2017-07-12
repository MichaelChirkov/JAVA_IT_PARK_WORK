package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itpark.model.PracticTask;
import ru.itpark.model.Theme;
import ru.itpark.model.TheoreticTask;
import ru.itpark.model.User;
import ru.itpark.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TheoreticTestController {

    @Autowired
    UsersService usersService;

    @Autowired
    UserAnswersService userAnswersService;

    @Autowired
    TheoreticTasksService theoreticTasksService;

    @Autowired
    ThemesService themesService;

    private DateFormat TIMESTAMP = new SimpleDateFormat("HH:mm:ss");


    public void checkPrincipal(Principal principal, Model model) {
        if (principal != null) {
            User user = usersService.getByUsername(principal.getName());
            model.addAttribute("user", user);
        }
    }

    @RequestMapping(value = "/theoretic-tests", method = RequestMethod.GET)
    public String showTheoreticTestPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        List<Theme> list = themesService.getAllThemes();
        model.addAttribute("themes", list);
        return "theoretic-tests-main";
    }

    @RequestMapping(value = "/theoretic-tests", method = RequestMethod.POST)
    public String ShowSomeTheoreticTest(HttpServletRequest request, Principal principal, HttpSession hs, Model model) {
        hs.removeAttribute("selected-theme-id");
        hs.removeAttribute("start-time");
        hs.removeAttribute("task");
        int themeId = Integer.parseInt(request.getParameter("select"));
        Date startTestTime = new Date();
        User user = usersService.getByUsername(principal.getName());
        theoreticTasksService.dropPrevResults(user.getId(), themeId);
        TheoreticTask lastTheoreticTask = theoreticTasksService.getByIdAndThemeId(
                userAnswersService.getLastPracticTask(user.getId(), themeId), themeId);
        hs.setAttribute("selected-theme-id", themeId);
        hs.setAttribute("start-time", startTestTime);
        hs.setAttribute("currentTask", lastTheoreticTask);
        model.addAttribute("user", user);
        model.addAttribute("task", lastTheoreticTask);
        return "theoretic-tests-pages\\theoretic-test-page";
    }

    @RequestMapping(value = "/theoretic-check", method = RequestMethod.POST)
    public String checkAnswer(Principal principal, HttpServletRequest req, HttpSession hs, Model model) {
        String answer = req.getParameter("answer");
        User user = usersService.getByUsername(principal.getName());
        //PracticTask nextPracticTask = practicTasksService.checkAnswer(answer, user.getId(), (int)hs.getAttribute("selected-theme-id"), (PracticTask)hs.getAttribute("currentTask"));
        TheoreticTask nextTheoreticTask = theoreticTasksService.checkAnswer(answer, user.getId(), (int) hs.getAttribute("selected-theme-id"), (TheoreticTask) hs.getAttribute("currentTask"));
        if (nextTheoreticTask == null) {
            Date startDate = (Date) hs.getAttribute("start-time");
            Date endDate = new Date();
            System.out.println(TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180)));
            String dateForPage = TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180));
            model.addAttribute("time", dateForPage);
            model.addAttribute("answer", userAnswersService.getTheoreticAnswerCount(user.getId(), (int) hs.getAttribute("selected-theme-id")));
            model.addAttribute("theme", themesService.getById((int) hs.getAttribute("selected-theme-id")));
            model.addAttribute("tasksCount", theoreticTasksService.getTheoreticTaskCountByTheme((int) hs.getAttribute("selected-theme-id")));
            return "theoretic-tests-pages\\theoretic-test-end";
        }
        hs.setAttribute("currentTask", nextTheoreticTask);
        model.addAttribute("user", user);
        model.addAttribute("task", nextTheoreticTask);
        return "theoretic-tests-pages\\theoretic-test-page";
    }
}
