package br.com.cadastro.Cadastro.de.Usuario.applcation.controller;


import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.UsuarioDto;
import br.com.cadastro.Cadastro.de.Usuario.applcation.form.UsuarioForm;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.service.IUsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    private IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrarUsuario(@RequestBody @Validated UsuarioForm usuario){
        this.usuarioService.cadastrarUsuario(usuario.converter());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> buscarListaDeUsuarios(){
        return ResponseEntity.status(HttpStatus.FOUND).body( this.usuarioService.buscarListaDeUsuarios());
    }

    @GetMapping("/{id_usuario}")
    public ResponseEntity<UsuarioDto> buscarUsuario(@PathVariable Long id_usuario) {
        Optional<Usuario> usuario = this.usuarioService.buscarUsuarioPorIdUsuario(id_usuario);
        return usuario.map(value ->
                ResponseEntity.status(HttpStatus.FOUND).body(new UsuarioDto(value)))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{id_usuario}")
    public ResponseEntity<HttpStatus> apagarUsuario(@PathVariable Long id_usuario){
        this.usuarioService.deletarUsuarioPorIdUsuario(id_usuario);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
