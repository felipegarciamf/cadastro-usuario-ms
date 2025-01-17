package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;
import jakarta.persistence.Embedded;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsuarioDto {

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.sobrenome = usuario.getSobrenome();
        this.endereco = new EnderecoDto(usuario.getEndereco());
        this.senha = new SenhaDto(usuario.getSenha());
    }

    private Long id;

    private String nome;

    private String sobrenome;

    private EnderecoDto endereco;

    private SenhaDto senha;


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public SenhaDto getSenha() {
        return senha;
    }

    public Long getId() {
        return id;
    }

    public static List<UsuarioDto> converter(List<Usuario> usuario) {
        return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }

}
