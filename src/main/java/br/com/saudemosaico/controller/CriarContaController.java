package br.com.saudemosaico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/criar-conta")
public class CriarContaController {

    @GetMapping
    public String criarConta(Model model) {
        return "criar-conta";
    }

    @PostMapping
    public String criarContaPost() {
        // Lógica para criar conta
        return "redirect:/login";
    }
}