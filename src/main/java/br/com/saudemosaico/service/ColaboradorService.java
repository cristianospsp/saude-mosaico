package br.com.saudemosaico.service;

import br.com.saudemosaico.domain.Colaborador;
import br.com.saudemosaico.repository.ColaboradorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ColaboradorService {
    
    private final ColaboradorRepository colaboradorRepository;
    
    public Colaborador criar(Colaborador colaborador) {
        if (colaboradorRepository.existsByEmail(colaborador.getEmail())) {
            throw new IllegalStateException("Email já cadastrado");
        }
        if (colaboradorRepository.existsByCpf(colaborador.getCpf())) {
            throw new IllegalStateException("CPF já cadastrado");
        }
        return colaboradorRepository.save(colaborador);
    }
    
    public Colaborador atualizar(Long id, Colaborador colaborador) {
        colaboradorRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Colaborador não encontrado"));
            
        colaborador.setId(id);
        return colaboradorRepository.save(colaborador);
    }
    
    public void deletar(Long id) {
        if (!colaboradorRepository.existsById(id)) {
            throw new EntityNotFoundException("Colaborador não encontrado");
        }
        colaboradorRepository.deleteById(id);
    }
    
    public Colaborador buscarPorId(Long id) {
        return colaboradorRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Colaborador não encontrado"));
    }
    
    public List<Colaborador> listarTodos() {
        return colaboradorRepository.findAll();
    }
}
