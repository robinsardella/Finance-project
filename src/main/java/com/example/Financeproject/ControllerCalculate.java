package com.example.Financeproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerCalculate {

    @GetMapping("/calculate")
    public String getCalculate(Model model) {

        model.addAttribute("UserFinancials", new UserFinancials());
        return "calculate";
    }

    @PostMapping("/calculate")
    public String postCalculate(Model model, @ModelAttribute UserFinancials userFinancials) {


        return "calculated"; }
}
