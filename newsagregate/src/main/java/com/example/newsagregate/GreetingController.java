package com.example.newsagregate;

import com.example.newsagregate.model.NewsBlog;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Controller
    public class GreetingController {
    public static List<Greeting> list = new ArrayList<>(new NewsBlog().getNewsList());
     
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        list.add(greeting);
        model.addAttribute("blogs", list);
        return "blog";
    }


}

