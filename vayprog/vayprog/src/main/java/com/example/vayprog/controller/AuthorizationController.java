package com.example.vayprog.controller;




        import com.example.vayprog.Greeting;
        import com.example.vayprog.dto.FormUsers;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorizationController {

    @GetMapping("/authorization")
    public String authorizationPage(Model model) {
        model.addAttribute("form", new FormUsers());
        return "authorization";
    }
   /* @GetMapping("/authorization")
    public String authorization(Model model) {
        model.addAttribute("greeting",new Greeting());
        return "authorization";
    }*/

    @PostMapping("/authorization")
    public String authorizationHandlerPage(Model model, @ModelAttribute FormUsers form) {

        if (!UsersController.users.containsKey(form.getLogin())) {
            model.addAttribute("error", true);
            model.addAttribute("form", new FormUsers());
            return "authorization";
        } else if (!form.getPassword().equals(UsersController.users.get(form.getLogin()).getPassword())) {
            model.addAttribute("error", true);
            model.addAttribute("form", new FormUsers());
            return "authorization";
        } else {
            model.addAttribute("form", new FormUsers());
            model.addAttribute("user", UsersController.users.get(form.getLogin()));
            return "index";
        }
    }

}
