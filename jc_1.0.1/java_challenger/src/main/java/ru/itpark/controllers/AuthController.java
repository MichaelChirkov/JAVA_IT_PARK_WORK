package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.model.User;
import ru.itpark.service.UsersService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Michael on 04.07.2017.
 */
@Controller
public class AuthController {
    @Autowired
    UsersService usersService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(@RequestParam(value = "error", required = false) String error,
                                @RequestParam(value = "logout", required = false) String logout,
                                @RequestParam(value = "registr_success", required = false) String registr_success,
                                Model flag) {
        flag.addAttribute("error", error != null);
        flag.addAttribute("logout", logout != null);
        flag.addAttribute("registr_success", registr_success != null);
        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegistrationPage(@RequestParam(value = "error", required = false) String error, Model flag) {
        flag.addAttribute("error", error != null);
        return "registr";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signupPost(Model model, HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        User newUser = new User(userName, password, name);
        if (usersService.checkUsernameAndName(newUser.getUsername(), newUser.getName())) {
            usersService.register(newUser);

            return "redirect:/login?registr_success";
        } else {

            return "redirect:/registration?error";
        }
    }
}
