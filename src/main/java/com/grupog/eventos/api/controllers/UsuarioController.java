package com.grupog.eventos.api.controllers;

import com.grupog.eventos.domain.model.Usuario;
import com.grupog.eventos.domain.repository.UsuarioRepository;
import com.grupog.eventos.domain.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Usuario> buscar(@PathVariable Long usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);

        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario adicionar(@Valid @RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<Void> deletar(@PathVariable Long usuarioId) {
        if (!usuarioRepository.existsById(usuarioId)) {
            return ResponseEntity.notFound().build();
        }

        usuarioService.excluir(usuarioId);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{usuarioId}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long usuarioId, @Valid @RequestBody Usuario usuario) {
        if (!usuarioRepository.existsById(usuarioId)) {
            return ResponseEntity.notFound().build();
        }

        usuario.setId(usuarioId);
        usuario = usuarioService.salvar(usuario);

        return ResponseEntity.ok(usuario);
    }

}
