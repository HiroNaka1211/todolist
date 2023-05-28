package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    List<Todo> todos = new ArrayList<>();
    
    @GetMapping("todo")
    public String getIndex(Model model){

        Todo todo = new Todo("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "B", "C", "D");
        todos.add(todo);
        Todo todo1 = new Todo("A", "B", "C", "D");
        todos.add(todo1);
        model.addAttribute("todos", todos);
        return "index";
    }

    @GetMapping("/todo/add")
    public String getAdd(Model model) {
        return "add";
    }
}
