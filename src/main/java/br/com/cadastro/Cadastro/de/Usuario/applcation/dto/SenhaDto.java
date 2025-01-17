package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;

public class SenhaDto {

    public SenhaDto(Senha senha) {
        this.senha = senha.getHash();
    }

    private String senha;

    public String getSenha() {
        return senha;
    }
}
