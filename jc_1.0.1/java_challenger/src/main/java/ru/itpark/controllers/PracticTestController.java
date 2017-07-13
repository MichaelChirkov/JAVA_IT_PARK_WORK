package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itpark.model.PracticTask;
import ru.itpark.model.Theme;
import ru.itpark.model.User;
import ru.itpark.service.PracticTasksService;
import ru.itpark.service.ThemesService;
import ru.itpark.service.UserAnswersService;
import ru.itpark.service.UsersService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PracticTestController {


    @Autowired
    UsersService usersService;

    @Autowired
    UserAnswersService userAnswersService;

    @Autowired
    PracticTasksService practicTasksService;

    @Autowired
    ThemesService themesService;

    private DateFormat TIMESTAMP = new SimpleDateFormat("HH:mm:ss");


    public void checkPrincipal(Principal principal, Model model) {
        if (principal != null) {
            User user = usersService.getByUsername(principal.getName());
            model.addAttribute("user", user);
        }
    }

    @RequestMapping(value = "/practic-tests", method = RequestMethod.GET)
    public String showTestPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        List<Theme> list = themesService.getAllThemes();
        model.addAttribute("themes", list);
        return "practic-tests-main";
    }

    @RequestMapping(value = "/practic-tests", method = RequestMethod.POST)
    public String ShowSomePracticTest(HttpServletRequest request, Principal principal, HttpSession hs, Model model) {
        hs.removeAttribute("selected-theme-id");
        hs.removeAttribute("start-time");
        hs.removeAttribute("task");
        int themeId = Integer.parseInt(request.getParameter("select"));
        Date startTestTime = new Date();
        User user = usersService.getByUsername(principal.getName());
        practicTasksService.dropPrevResults(user.getId(), themeId);
        PracticTask lastPracticTask = practicTasksService.getByIdAndThemeId(
                userAnswersService.getLastPracticTask(user.getId(), themeId), themeId);
        hs.setAttribute("selected-theme-id", themeId);
        hs.setAttribute("start-time", startTestTime);
        hs.setAttribute("currentTask", lastPracticTask);
        model.addAttribute("bar", practicTasksService.getComplitedPracticTasksCountForProgressBar(user.getId(), themeId));
        model.addAttribute("user", user);
        model.addAttribute("task", lastPracticTask);
        return "practic-tests-pages\\practic-test-page";
    }

    @RequestMapping(value = "/practic-check", method = RequestMethod.POST)
    public String checkAnswer(Principal principal, HttpServletRequest req, HttpSession hs, Model model) {
        String answer = req.getParameter("answer");
        User user = usersService.getByUsername(principal.getName());
        PracticTask nextPracticTask = practicTasksService.checkAnswer(practicTasksService.convertAnswer(answer), user.getId(), (int) hs.getAttribute("selected-theme-id"), (PracticTask) hs.getAttribute("currentTask"));
        if (nextPracticTask == null) {
            Date startDate = (Date) hs.getAttribute("start-time");
            Date endDate = new Date();
            System.out.println(TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180)));
            String dateForPage = TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180));
            model.addAttribute("time", dateForPage);
            model.addAttribute("answer", userAnswersService.getPracticAnswerCount(user.getId(), (int) hs.getAttribute("selected-theme-id")));
            model.addAttribute("theme", themesService.getById((int) hs.getAttribute("selected-theme-id")));
            model.addAttribute("tasksCount", practicTasksService.getPracticTaskCountByTheme((int) hs.getAttribute("selected-theme-id")));
            return "practic-tests-pages\\practic-test-end";
        }
        hs.setAttribute("currentTask", nextPracticTask);
        model.addAttribute("bar", practicTasksService.getComplitedPracticTasksCountForProgressBar(user.getId(), (int) hs.getAttribute("selected-theme-id")));
        model.addAttribute("user", user);
        model.addAttribute("task", nextPracticTask);
        return "practic-tests-pages\\practic-test-page";
    }
}
