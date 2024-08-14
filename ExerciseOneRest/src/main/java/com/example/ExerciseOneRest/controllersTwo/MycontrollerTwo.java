package com.example.ExerciseOneRest.controllersTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MycontrollerTwo {
    @GetMapping({ "login"})   // either type '/' or index
    public String showIndex()
    {
        return "index";
    }

}
