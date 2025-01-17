package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;

public record SenhaDto(String senha) {

    // Construtor customizado para aceitar um objeto Senha
    public SenhaDto(Senha senha) {
        this(senha.getHash()); // Usa o valor do hash da senha
    }
}
