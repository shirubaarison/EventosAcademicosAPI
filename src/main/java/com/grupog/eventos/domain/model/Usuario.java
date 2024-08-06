package com.grupog.eventos.domain.model;

import com.grupog.eventos.domain.validation.ValidationGroups;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Usuario {

    @NotNull(groups = ValidationGroups.UsuarioId.class)
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Size(min = 14, max = 14)
    private String cpf;

    @NotBlank
    @Size(max = 60)
    private String instituicao;

    @NotBlank
    @Email
    private String email;
}
