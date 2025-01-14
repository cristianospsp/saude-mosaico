package br.com.saudemosaico.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login(Model model) {
        return "login";
    }

    @PostMapping
    public String loginPost() {
        // Lógica para lidar com o login
        return "redirect:/";
    }
}