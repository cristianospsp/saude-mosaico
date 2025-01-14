package br.com.saudemosaico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AgendamentoController {

    @GetMapping("/novo-agendamento")
    public String novoAgendamento(Model model) {
        // Dados mockados para teste
        List<String> especialidades = Arrays.asList(
            "Clínico Geral",
            "Pediatria",
            "Psicologia",
            "Cardiologia",
            "Neurologia"
        );
        
        model.addAttribute("especialidades", especialidades);
        return "novo-agendamento";
    }
}
