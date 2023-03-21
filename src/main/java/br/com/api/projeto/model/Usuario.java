package br.com.api.projeto.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "É obrigatório inserir um nome!")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres!")
    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Email(message = "Insira um email válido!")
    @NotBlank(message = "É obrigatório inserir um email!")
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @NotBlank(message = "É obrigatório inserir uma senha!")
    @Column(name = "senha",columnDefinition = "TEXT", nullable = false)
    private String senha;

    @NotBlank(message = "É obrigatório inserir um telefone!")
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
}
