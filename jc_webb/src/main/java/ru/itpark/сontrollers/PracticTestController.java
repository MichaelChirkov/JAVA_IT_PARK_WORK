package ru.itpark.сontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itpark.models.PracticTask;
import ru.itpark.models.TheoreticTask;
import ru.itpark.models.User;
import ru.itpark.service.PracticTaskService;
import ru.itpark.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PracticTestController {

    @Autowired
    UserService userService;

    @Autowired
    PracticTaskService practicTaskService;

    private DateFormat TIMESTAMP = new SimpleDateFormat("HH:mm:ss");

    public void checkPrincipal( Principal principal, Model model) {
        if (principal != null) {
            User user = userService.findByLogin(principal.getName());
            model.addAttribute("user", user);
        }
    }

    @RequestMapping(value = "/practic-tests", method = RequestMethod.GET)
    public String showTestPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        return "practic-tests-main";
    }


    @RequestMapping(value = "/practic-tests", method = RequestMethod.POST)
    public String ShowSomePracticTest(HttpServletRequest request, Principal principal, HttpSession hs, Model model) {
        int taskId;
        hs.removeAttribute("type");
        hs.removeAttribute("task");
        hs.removeAttribute("date");
        hs.removeAttribute("type");

        Date startTestTime = new Date();
        String theme = request.getParameter("select");

        if (theme == null) {
            return "404";
        }

        hs.setAttribute("date", startTestTime);
        hs.setAttribute("type", theme);

        User user = userService.findByLogin(principal.getName());

        if (theme.equals("data_types")) {
            user.setComplitedPracticTasks(user.getComplitedPracticTasks() - user.getFirstThemePracticAnswerCount());
            user.setFirstThemePracticAnswerCount(0);
            PracticTask task = practicTaskService.getById(1);
            taskId = task.getId();
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getFirstThemePracticAnswerCount());
        }
        if (theme.equals("variable_types")) {
            hs.setAttribute("type", theme);
            user.setComplitedPracticTasks(user.getComplitedPracticTasks() - user.getSecondThemePracticAnswerCount());
            user.setSecondThemePracticAnswerCount(0);
            PracticTask task = practicTaskService.getById(6);
            taskId = task.getId() - 5;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getSecondThemePracticAnswerCount());
        }
        if (theme.equals("cycles_in_java")) {
            user.setComplitedPracticTasks(user.getComplitedPracticTasks() - user.getThirdThemePracticAnswerCount());
            user.setThirdThemePracticAnswerCount(0);
            PracticTask task = practicTaskService.getById(11);
            taskId = task.getId() - 10;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getThirdThemePracticAnswerCount());
        }

        if (theme.equals("classes")) {
            user.setComplitedPracticTasks(user.getComplitedPracticTasks() - user.getFourThemePracticAnswerCount());
            user.setFourThemePracticAnswerCount(0);
            PracticTask task = practicTaskService.getById(16);
            taskId = task.getId() - 15;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getFourThemePracticAnswerCount());
        }

        userService.update(user);
        model.addAttribute("user", user);
        return "practic-tests-pages\\practic-test-page";
    }

    @RequestMapping(value = "/practic-check", method = RequestMethod.POST)
    public String checkAnswer(Principal principal, HttpServletRequest req, HttpSession hs, Model model) {
        String answer = req.getParameter("answer");
        int taskId;

        PracticTask taskFromSession = (PracticTask) hs.getAttribute("task");
        hs.removeAttribute("task");
        String themeFromSession = (String) hs.getAttribute("type");
        User user = userService.findByLogin(principal.getName());

        if (themeFromSession.equals("data_types")) {
            if (taskFromSession.getTrueAnswer().equals(answer)) {
                user.setFirstThemePracticAnswerCount(user.getFirstThemePracticAnswerCount() + 1);
                userService.update(user);
            }
            if (taskFromSession.getId() == 5) {
                Date startDate = (Date) hs.getAttribute("date");
                Date endDate = new Date();
                System.out.println(TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180)));
                String dateForPage = TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180));

                model.addAttribute("time", dateForPage);
                model.addAttribute("answer", user.getFirstThemePracticAnswerCount());
                model.addAttribute("theme", themeFromSession);
                return "practic-tests-pages\\practic-test-end";
            } else {
                PracticTask task = practicTaskService.getById(taskFromSession.getId() + 1);
                hs.setAttribute("task", task);
                taskId = task.getId();//------------------------------------
                model.addAttribute("answercount", user.getFirstThemePracticAnswerCount());
                model.addAttribute("taskid", taskId);
                model.addAttribute("task", task);
                model.addAttribute("user", user);
                return "practic-tests-pages\\practic-test-page";
            }
        }
        return "404";
    }




}
