package ru.itpark.сontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itpark.models.TheoreticTask;
import ru.itpark.models.User;
import ru.itpark.service.TheoreticTaskService;
import ru.itpark.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michael on 04.07.2017.
 */
@Controller
public class TheoreticTestsController {

    @Autowired
    UserService userService;

    @Autowired
    TheoreticTaskService theoreticTaskService;

    private DateFormat TIMESTAMP = new SimpleDateFormat("HH:mm:ss");

    public void checkPrincipal( Principal principal, Model model) {
        if (principal != null) {
            User user = userService.findByLogin(principal.getName());
            model.addAttribute("user", user);
        }
    }

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String showTestPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        return "tests_main";
    }


    @RequestMapping(value = "/tests", method = RequestMethod.POST)
    public String ShowSomeTest(HttpServletRequest request, Principal principal, HttpSession hs, Model model) {
        int taskId;
        hs.removeAttribute("type");
        hs.removeAttribute("task");
        hs.removeAttribute("date");
        hs.removeAttribute("type");

        Date startTestTime = new Date();
        String theme = request.getParameter("select");

        if (theme == null) {
            return "redirect:/tests";
        }

        hs.setAttribute("date", startTestTime);
        hs.setAttribute("type", theme);

        User user = userService.findByLogin(principal.getName());
        /*
        if (theme.equals("data_types")) {
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks()-user.getFirstThemeAnswerCount());
            user.setFirstThemeAnswerCount(0);
            userService.update(user);
            hs.setAttribute("type", theme);
            Task task = theoreticTaskService.getByID(1);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("user", user);
            return "test_page";
        }
        if (theme.equals("variable_types")) {
            hs.setAttribute("type", theme);
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks()-user.getSecondThemeAnswerCount());
            user.setSecondThemeAnswerCount(0);
            userService.update(user);
            Task task = theoreticTaskService.getByID(11);
            taskId = task.getId() - 10;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("user", user);
            return "test_page";
        }
        if (theme.equals("cycles_in_java")) {
            hs.setAttribute("type", theme);
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks()-user.getThirdThemeAnswerCount());
            user.setThirdThemeAnswerCount(0);
            userService.update(user);
            Task task = theoreticTaskService.getByID(21);
            taskId = task.getId() - 20;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("user", user);
            return "test_page";
        }

        if (theme.equals("classes")) {
            hs.setAttribute("type", theme);
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks()-user.getFourThemeAnswerCount());
            user.setFourThemeAnswerCount(0);
            userService.update(user);
            Task task = theoreticTaskService.getByID(31);
            taskId = task.getId() - 30;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("user", user);
            return "test_page";
        } */

        if (theme.equals("data_types")) {
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks() - user.getFirstThemeAnswerCount());
            user.setFirstThemeAnswerCount(0);
            TheoreticTask task = theoreticTaskService.getByID(1);
            taskId = task.getId();
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getFirstThemeAnswerCount());
        }
        if (theme.equals("variable_types")) {
            hs.setAttribute("type", theme);
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks() - user.getSecondThemeAnswerCount());
            user.setSecondThemeAnswerCount(0);
            TheoreticTask task = theoreticTaskService.getByID(11);
            taskId = task.getId() - 10;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getSecondThemeAnswerCount());
        }
        if (theme.equals("cycles_in_java")) {
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks() - user.getThirdThemeAnswerCount());
            user.setThirdThemeAnswerCount(0);
            TheoreticTask task = theoreticTaskService.getByID(21);
            taskId = task.getId() - 20;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getThirdThemeAnswerCount());
        }

        if (theme.equals("classes")) {
            user.setComplitedTheoreticTasks(user.getComplitedTheoreticTasks() - user.getFourThemeAnswerCount());
            user.setFourThemeAnswerCount(0);
            TheoreticTask task = theoreticTaskService.getByID(31);
            taskId = task.getId() - 30;
            model.addAttribute("taskid", taskId);
            hs.setAttribute("task", task);
            model.addAttribute("task", task);
            model.addAttribute("answercount", user.getFourThemeAnswerCount());
        }

        userService.update(user);
        model.addAttribute("user", user);
        return "theoretic-tests-pages\\test_page";
    }

    //-----Проверка задания, подгрузка следующего, апдейт юзера-------------------------
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkAnswer(Principal principal, HttpServletRequest req, HttpSession hs, Model model) {
        String answer = req.getParameter("answer");
        int taskId;

        TheoreticTask taskFromSession = (TheoreticTask) hs.getAttribute("task");
        hs.removeAttribute("task");
        String themeFromSession = (String) hs.getAttribute("type");
        User user = userService.findByLogin(principal.getName());


        if (themeFromSession.equals("data_types")) {
            if (taskFromSession.getTrueAnswer().equals(answer)) {
                user.setFirstThemeAnswerCount(user.getFirstThemeAnswerCount() + 1);
                userService.update(user);
            }
            if (taskFromSession.getId() == 10) {
                Date startDate = (Date) hs.getAttribute("date");
                Date endDate = new Date();
                System.out.println(TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180)));
                String dateForPage = TIMESTAMP.format(new Date(endDate.getTime() - startDate.getTime() - 60000 * 180));

                model.addAttribute("time", dateForPage);
                model.addAttribute("answer", user.getFirstThemeAnswerCount());
                model.addAttribute("theme", themeFromSession);
                return "theoretic-tests-pages\\test-end";
            } else {
                TheoreticTask task = theoreticTaskService.getByID(taskFromSession.getId() + 1);
                hs.setAttribute("task", task);
                taskId = task.getId();//------------------------------------
                model.addAttribute("answercount", user.getFirstThemeAnswerCount());
                model.addAttribute("taskid", taskId);
                model.addAttribute("task", task);
                model.addAttribute("user", user);
                return "theoretic-tests-pages\\test_page";
            }
        }


        if (themeFromSession.equals("variable_types")) {
            if (taskFromSession.getTrueAnswer().equals(answer)) {
                user.setSecondThemeAnswerCount(user.getSecondThemeAnswerCount() + 1);
                userService.update(user);
            }
            if (taskFromSession.getId() == 20) {
                model.addAttribute("answer", user.getSecondThemeAnswerCount());
                model.addAttribute("theme", themeFromSession);
                return "theoretic-tests-pages\\test-end";
            } else {
                TheoreticTask task = theoreticTaskService.getByID(taskFromSession.getId() + 1);
                hs.setAttribute("task", task);
                taskId = task.getId();//------------------------------------
                model.addAttribute("answercount", user.getSecondThemeAnswerCount());
                model.addAttribute("taskid", taskId);
                model.addAttribute("task", task);
                model.addAttribute("user", user);
                return "theoretic-tests-pages\\test_page";
            }
        }
        if (themeFromSession.equals("cycles_in_java")) {
            if (taskFromSession.getTrueAnswer().equals(answer) && themeFromSession.equals("cycles_in_java")) {
                user.setThirdThemeAnswerCount(user.getThirdThemeAnswerCount() + 1);
                userService.update(user);
            }
            if (taskFromSession.getId() == 30) {
                model.addAttribute("answer", user.getThirdThemeAnswerCount());
                model.addAttribute("theme", themeFromSession);
                return "theoretic-tests-pages\\test-end";
            } else {
                TheoreticTask task = theoreticTaskService.getByID(taskFromSession.getId() + 1);
                hs.setAttribute("task", task);
                taskId = task.getId();//------------------------------------
                model.addAttribute("answercount", user.getThirdThemeAnswerCount());
                model.addAttribute("taskid", taskId);
                model.addAttribute("task", task);
                model.addAttribute("user", user);
                return "theoretic-tests-pages\\test_page";
            }
        }


        if (themeFromSession.equals("classes")) {
            if (taskFromSession.getTrueAnswer().equals(answer)) {
                user.setFourThemeAnswerCount(user.getFourThemeAnswerCount() + 1);
                userService.update(user);
            }
            if (taskFromSession.getId() == 40) {
                model.addAttribute("answer", user.getFourThemeAnswerCount());
                model.addAttribute("theme", themeFromSession);
                return "theoretic-tests-pages\\test-end";
            } else {
                TheoreticTask task = theoreticTaskService.getByID(taskFromSession.getId() + 1);
                hs.setAttribute("task", task);
                taskId = task.getId();//------------------------------------
                model.addAttribute("answercount", user.getFourThemeAnswerCount());
                model.addAttribute("taskid", taskId);
                model.addAttribute("task", task);
                model.addAttribute("user", user);
                return "theoretic-tests-pages\\test_page";
            }
        }
        return "404";
    }

}
