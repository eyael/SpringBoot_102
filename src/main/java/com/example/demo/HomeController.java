package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "Home";
    }

    @RequestMapping("/recipe")
    public String recipe() {
        return "Recipe";
    }

    @RequestMapping("/recipes")
    public String recipes() {
        return "Recipes";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "Contact";
    }
}

