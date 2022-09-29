package edu.wctc.springbootassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chakalaka")
public class PrepareController {

    @RequestMapping("/preparing")
    public String preparation(){
        return "pages/preparing";
    }
}
