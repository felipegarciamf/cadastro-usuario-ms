package br.com.cadastro.Cadastro.de.Usuario.domain.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.UsuarioDto;
import br.com.cadastro.Cadastro.de.Usuario.applcation.form.UsuarioForm;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;

import java.util.List;
import java.util.Optional;


public interface IUsuarioService {

    Usuario cadastrarUsuario(UsuarioForm usuarioForm);

    void deletarUsuarioPorIdUsuario(Long idUsuario);

    Optional<Usuario> buscarUsuarioPorIdUsuario(Long idUsuario);

    List<UsuarioDto> buscarListaDeUsuarios();
}
