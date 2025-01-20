package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;
import jakarta.persistence.Embedded;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record UsuarioDto(
        Long id,
        String nome,
        String sobrenome,
        EnderecoDto endereco,
        SenhaDto senha
) {

    public UsuarioDto(Usuario usuario) {
        this(
                usuario.getId(),
                usuario.getNome(),
                usuario.getSobrenome(),
                new EnderecoDto(usuario.getEndereco()),
                new SenhaDto(usuario.getSenha())
        );
    }

    public static List<UsuarioDto> converter(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(UsuarioDto::new)
                .collect(Collectors.toList());
    }
}

