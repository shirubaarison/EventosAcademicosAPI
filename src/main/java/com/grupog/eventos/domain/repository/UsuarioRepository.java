package com.grupog.eventos.domain.repository;

import com.grupog.eventos.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByNome(String nome);
    List<Usuario> findByNomeContaining(String nome);

    Optional<Usuario> findByEmail(String email);

}
