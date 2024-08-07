package com.grupog.eventos.api.controllers;

import com.grupog.eventos.domain.model.Atividade;
import com.grupog.eventos.domain.repository.AtividadeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@ControllerAdvice
@RequestMapping("/atividades")
public class AtividadeController {

    private final AtividadeRepository atividadeRepository;

    @GetMapping
    public List<Atividade> listar() {
        return atividadeRepository.findAll();
    }

}
