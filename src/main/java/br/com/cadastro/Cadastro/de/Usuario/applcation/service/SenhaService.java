package br.com.cadastro.Cadastro.de.Usuario.applcation.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.form.SenhaForm;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.service.ISenhaService;
import br.com.cadastro.Cadastro.de.Usuario.infra.client.OpenApiClient;
import br.com.cadastro.Cadastro.de.Usuario.infra.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
class SenhaService implements ISenhaService {

    private UsuarioRepository usuarioRepository;

    private OpenApiClient openApiClient;

    public SenhaService(UsuarioRepository usuarioRepository, OpenApiClient openApiClient) {
        this.usuarioRepository = usuarioRepository;
        this.openApiClient = openApiClient;
    }

    @Override
    public void atualizarSenhaPorIdUsuario(Long id_usuario, SenhaForm senha) {

        Optional<Usuario> usuarioOptional = this.usuarioRepository.findById(id_usuario);
        if(usuarioOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        Usuario usuario = usuarioOptional.get();
        usuario.setSenha(senha.converter());

        String dados = this.openApiClient.getDados();
        System.out.println(dados);

        usuarioRepository.save(usuario);

    }
}
