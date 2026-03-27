package com.ifsp.haidar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Atividade4Controller {
    @GetMapping("/soma")
    public String somaForm() {
        return "somaForm.html";
    }

    @PostMapping("/resultado")
    public String somar(@RequestParam int primeiroNumero, @RequestParam int segundoNumero, Model model) {
        int total = primeiroNumero + segundoNumero;
        model.addAttribute("total", total);
        return "resultado.html";
    }
}
