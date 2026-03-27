package com.ifsp.haidar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Atividade4Controller {
    @GetMapping("/imc")
    public String calcularIMC() {
        return "formularioIMC.html";
    }

    @PostMapping("/resultadoIMC")
    public String resultadoIMC(@RequestParam int peso, @RequestParam double altura, Model model) {
        double alturaMetros = altura / 100;
        double imc = peso / (alturaMetros * alturaMetros);
        model.addAttribute("imc", imc);
        return "resultadoIMC.html";
    }

    @GetMapping("/emprestimo")
    public String emprestimo() {
        return "formularioEmprestimo.html";
    }

    @PostMapping("/resultadoEmprestimo")
    public String resultadoEmprestimo(@RequestParam double valor, @RequestParam double parcelas, @RequestParam double juros, Model model) {
        double valorParcela = (valor * (1 + (juros / 100))) / parcelas;
        model.addAttribute("valor", valor);
        model.addAttribute("juros", juros);
        model.addAttribute("parcelas", parcelas);
        model.addAttribute("valorParcela", valorParcela);
        return "resultadoEmprestimo.html";
    }
}
