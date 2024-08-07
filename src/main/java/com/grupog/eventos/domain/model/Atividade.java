package com.grupog.eventos.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Atividade {

    @EqualsAndHashCode.Include
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Max(255)
    private String titulo;

    @Size(min = 10, max = 60)
    private String localizacao;

    @NotNull
    @ManyToOne
    private Usuario autor;

    @Column(name = "data")
    private OffsetDateTime dataHora;

    @Min(1)
    private Integer maxInscricoes;

}
