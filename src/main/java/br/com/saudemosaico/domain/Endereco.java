package br.com.saudemosaico.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 8)
    private String cep;
    
    @Column(nullable = false)
    private String logradouro;
    
    @Column(nullable = false)
    private String numero;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = false, length = 2)
    private String estado;
}
