package br.com.cadastro.Cadastro.de.Usuario.applcation.controller;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.EnderecoDto;
import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.SenhaDto;
import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.UsuarioDto;
import br.com.cadastro.Cadastro.de.Usuario.applcation.form.SenhaForm;
import br.com.cadastro.Cadastro.de.Usuario.domain.service.ISenhaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/senhas")
public class SenhaController {

    private ISenhaService senhaService;

    public SenhaController(ISenhaService senhaService) {
        this.senhaService = senhaService;
    }

    @PutMapping("/{id_usuario}")
    public ResponseEntity<HttpStatus> atualizarSenha(@PathVariable Long id_usuario, @RequestBody SenhaForm senha){
        this.senhaService.atualizarSenhaPorIdUsuario(id_usuario, senha);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
