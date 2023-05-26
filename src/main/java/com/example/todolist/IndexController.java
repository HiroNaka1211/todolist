package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/todo")
    public String getIndex(Model model){
        model.addAttribute("hello", "hello");
        return "index";
    }
}