package com.example.schola2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("showButtonB", false);
        model.addAttribute("showMessage", false);
        return "index";
    }

    @PostMapping("/button-a")
    public String buttonAClicked(Model model) {
        model.addAttribute("showButtonB", true);
        model.addAttribute("showMessage", false);
        return "index";
    }

    @PostMapping("/button-b")
    public String buttonBClicked(Model model) {
        model.addAttribute("showButtonB", false);
        model.addAttribute("showMessage", true);
        return "index";
    }
}