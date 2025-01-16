package br.com.cadastro.Cadastro.de.Usuario.applcation.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.UsuarioDto;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.service.IUsuarioService;
import br.com.cadastro.Cadastro.de.Usuario.infra.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public void deletarUsuarioPorIdUsuario(Long idUsuario) {
        this.usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorIdUsuario(Long idUsuario) {
        return this.usuarioRepository.findById(idUsuario);
    }

    @Override
    public List<UsuarioDto> buscarListaDeUsuarios() {
        List<Usuario> listaUsuarios = this.usuarioRepository.findAll();
        List<UsuarioDto> usuariosDto = UsuarioDto.converter(listaUsuarios);
        return usuariosDto;
    }


}
