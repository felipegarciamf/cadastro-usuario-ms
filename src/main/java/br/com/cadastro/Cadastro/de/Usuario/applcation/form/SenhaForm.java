package br.com.cadastro.Cadastro.de.Usuario.applcation.form;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class SenhaForm {

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Senha converter() {
        return new Senha(this.senha);
    }


}
