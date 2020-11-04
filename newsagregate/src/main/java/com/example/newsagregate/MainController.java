package com.example.newsagregate;

import com.example.newsagregate.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "index";
    }



    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("greeting",new Greeting());
        return "blog";
    }


    @GetMapping("/result")
    public String result(Model model) {
        model.addAttribute("greeting",new Greeting());
        return "result";
    }

}