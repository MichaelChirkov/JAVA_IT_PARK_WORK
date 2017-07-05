package ru.itpark.сontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
 * Created by Michael on 28.06.2017.
 */

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private TheoreticTaskService theoreticTaskService;

    private DateFormat TIMESTAMP = new SimpleDateFormat("HH:mm:ss");


    //---------------------Главная и страницы из верхнего бара---------------------

    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String showPage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "home";
    }

    @RequestMapping("/study")
    public String showStudyStartPage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "study-start";
    }

    @RequestMapping("/contact")
    public String showContactPage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "contact";
    }



    //----------------------Теоретические тесты---------------------


    //--------------------------------------------



    //меню-> учебные материалы
    @RequestMapping("/data_types")
    public String showStudyThemeOnePage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "study-pages\\data_types";
    }

    @RequestMapping("/variable_types")
    public String showStudySecondOnePage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "study-pages\\variable_types";
    }

    @RequestMapping("/cycles_in_java")
    public String showStudyThirdOnePage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "study-pages\\cycles_in_java";
    }

    @RequestMapping("/classes")
    public String showStudyThemeFourPage(Principal principal, Model model) {
        checkPrincipal(principal,model);
        return "study-pages\\classes";
    }

    public void checkPrincipal( Principal principal, Model model) {
        if (principal != null) {
            User user = userService.findByLogin(principal.getName());
            model.addAttribute("user", user);
        }
    }

}
