package com.example.newsagregate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

   /* @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "index";
    }*/


    @GetMapping("/blog")
    public String blog(Model model) {
          model.addAttribute("blogs", GreetingController.list);
        return "blog";
    }

}
