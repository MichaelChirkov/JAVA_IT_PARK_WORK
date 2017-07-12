package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.model.Theme;
import ru.itpark.model.User;
import ru.itpark.service.ThemesService;
import ru.itpark.service.UsersService;

import java.security.Principal;
import java.util.List;

/**
 * Created by Michael on 11.07.2017.
 */
@Controller
public class MainController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private ThemesService themesService;

    public void checkPrincipal(Principal principal, Model model) {
        if (principal != null) {
            User user = usersService.getByUsername(principal.getName());
            model.addAttribute("user", user);
        }
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String showPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        return "home";
    }

    @RequestMapping("/study")
    public String showStudyStartPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        List<Theme> list = themesService.getAllThemes();
        model.addAttribute("themes", list);
        return "study-start";
    }

    @RequestMapping("/contact")
    public String showContactPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        return "contact";
    }

    @RequestMapping("/theoretic-ranking")
    public String showTheoreticRanking(Principal principal, Model model) {
        checkPrincipal(principal, model);
        List<User> users = usersService.getTheoreticalTopList();
        model.addAttribute("users", users);
        return "theoretic-ranking";
    }

    @RequestMapping("/practic-ranking")
    public String showPracticRanking(Principal principal, Model model) {
        checkPrincipal(principal, model);
        List<User> users = usersService.getPracticTopList();
        model.addAttribute("users", users);
        return "practic-ranking";
    }

    //меню-> учебные материалы
    @RequestMapping("/data_types")
    public String showStudyThemeOnePage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        model.addAttribute("theme", themesService.getById(1));
        return "study-pages\\data_types";
    }

    @RequestMapping("/variable_types")
    public String showStudySecondOnePage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        model.addAttribute("theme", themesService.getById(2));
        return "study-pages\\variable_types";
    }

    @RequestMapping("/cycles_in_java")
    public String showStudyThirdOnePage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        model.addAttribute("theme", themesService.getById(3));
        return "study-pages\\cycles_in_java";
    }

    @RequestMapping("/classes")
    public String showStudyThemeFourPage(Principal principal, Model model) {
        checkPrincipal(principal, model);
        model.addAttribute("theme", themesService.getById(4));
        return "study-pages\\classes";
    }
}
