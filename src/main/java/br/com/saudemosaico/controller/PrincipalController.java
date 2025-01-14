package br.com.saudemosaico.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/principal")
    public String principal() {
        return "principal";
    }
}