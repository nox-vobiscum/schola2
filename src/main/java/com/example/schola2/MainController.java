package com.example.schola2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        // Nach jedem Reload: Zustand zurücksetzen
        model.addAttribute("showButtonB", false);
        model.addAttribute("showMessage", false);
        return "index";
    }

    @PostMapping("/button-a")
    public String buttonAClicked(Model model) {
        // Nach Klick auf Button A: Button B anzeigen
        model.addAttribute("showButtonB", true);
        model.addAttribute("showMessage", false);
        return "index";
    }

    @PostMapping("/button-b")
    public String buttonBClicked(Model model) {
        // Nach Klick auf Button B: Nachricht anzeigen
        model.addAttribute("showButtonB", false);
        model.addAttribute("showMessage", true);
        return "index";
    }
}