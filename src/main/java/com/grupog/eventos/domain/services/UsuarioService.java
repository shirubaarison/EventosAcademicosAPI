package com.grupog.eventos.domain.services;

import com.grupog.eventos.domain.model.Usuario;
import com.grupog.eventos.domain.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario cadastrar(@Valid Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Transactional
    public void excluir(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
