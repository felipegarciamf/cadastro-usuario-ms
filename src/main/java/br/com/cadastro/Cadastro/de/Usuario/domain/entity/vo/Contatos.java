package br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Contatos {

    private String email;

    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
