package com.example.newsagregate.controller;

import ch.qos.logback.core.db.dialect.MsSQLDialect;
import javax.servlet.http.HttpServletRequest;

import com.example.newsagregate.ListMsg;
import com.example.newsagregate.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MsgController {
    @Autowired
    ListMsg listMsg;


    @GetMapping("/test")
    public String page(Model model) {
        model.addAttribute("msgs", listMsg.getMsgs());
        return "blogs";
    }

    @PostMapping(path = "/test")
    public String addOrder(Model model, @ModelAttribute Msg msg, @RequestParam String name) {
        final boolean add = listMsg.getMsgs().add(new Msg("оглавление", "контекст"));
        model.addAttribute("msgs", listMsg.getMsgs());
        return "blogs";
    }
}

