package br.com.saudemosaico.controller;

import br.com.saudemosaico.domain.Cargo;
import br.com.saudemosaico.domain.Colaborador;
import br.com.saudemosaico.service.ColaboradorService;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/colaboradores")
@RequiredArgsConstructor
public class ColaboradorViewController {

    private final ColaboradorService colaboradorService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("colaboradores", colaboradorService.listarTodos());
        return "colaboradores/lista";
    }

    @GetMapping("/novo")
    public String novo() {
        return "colaboradores/novo";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Colaborador colaborador = colaboradorService.buscarPorId(id);
        model.addAttribute("colaborador", colaborador);
        model.addAttribute("cargos", Cargo.values());
        List<String> estados = Arrays.asList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
        model.addAttribute("estados", estados);
        
        return "colaboradores/editar";
    }
}

