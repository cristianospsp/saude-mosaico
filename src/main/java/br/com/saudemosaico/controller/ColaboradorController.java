package br.com.saudemosaico.controller;

import br.com.saudemosaico.domain.Colaborador;
import br.com.saudemosaico.service.ColaboradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
@RequiredArgsConstructor
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    @PostMapping
    public ResponseEntity<Colaborador> criar(@RequestBody Colaborador colaborador) {
        return ResponseEntity.ok(colaboradorService.criar(colaborador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Colaborador> atualizar(@PathVariable Long id, @RequestBody Colaborador colaborador) {
        return ResponseEntity.ok(colaboradorService.atualizar(id, colaborador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        colaboradorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborador> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(colaboradorService.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Colaborador>> listarTodos() {
        return ResponseEntity.ok(colaboradorService.listarTodos());
    }
}
