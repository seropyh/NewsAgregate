package com.example.newsagregate.controller;

import com.example.newsagregate.dto.FormUsers;
import com.example.newsagregate.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String registrationPage(Model model) {
        model.addAttribute("form", new FormUsers());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationHandlerPage(Model model, @ModelAttribute FormUsers form) {
        if (UsersController.users.containsKey(form.getLogin())) {
            model.addAttribute("error", true);
            model.addAttribute("form", new FormUsers());
            return "registration";
        } else {
            UsersController.users.put(form.getLogin(), new User(form.getLogin(), form.getPassword(), form.getAge()));
            model.addAttribute("form", new FormUsers());
            model.addAttribute("user", UsersController.users.get(form.getLogin()));
            return "authorization";
        }
    }

}
