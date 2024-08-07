package com.grupog.eventos.domain.repository;

import com.grupog.eventos.domain.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByTitulo(String nome);
    List<Atividade> findByTituloContaining(String nome);

}
