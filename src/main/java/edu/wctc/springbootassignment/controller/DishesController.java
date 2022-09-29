package edu.wctc.springbootassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chakalaka")
public class DishesController {

    @RequestMapping("/other-dishes")
    public String ingredients(){
        return "pages/other-dishes";
    }
}
