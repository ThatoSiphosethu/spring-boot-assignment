package edu.wctc.springbootassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/credits")
    public String redirectOffsite(){
        return "redirect:https://www.africanbites.com/chakalaka/";
    }
}
