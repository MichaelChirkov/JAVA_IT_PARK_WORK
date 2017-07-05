package ru.itpark.сontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.itpark.models.User;
import ru.itpark.service.UserService;

import java.security.Principal;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //стоит ли делать /users filter=answer_count
    @GetMapping(value = "/ranking")
   public String getUsersByTheoreticAnswers(Principal principal, @ModelAttribute("model") ModelMap model, Model modeluser) {

    if (principal != null) {
            User user = userService.findByLogin(principal.getName());
            modeluser.addAttribute("user", user);
        }
        List<User> users = userService.getTheoreticalTopList();
        model.addAttribute("users", users);

        return "theoretic-ranking";
    }

    @GetMapping(value = "/practic-ranking")
    public String getUsersByPracticAnswers(Principal principal, @ModelAttribute("model") ModelMap model, Model modeluser) {

        if (principal != null) {
            User user = userService.findByLogin(principal.getName());
            modeluser.addAttribute("user", user);
        }
        List<User> users = userService.getPracticTopList();
        model.addAttribute("users", users);

        return "practic-ranking";
    }

}
