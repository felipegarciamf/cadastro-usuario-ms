package br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo;


import jakarta.persistence.Embeddable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;

@Embeddable
public class Senha {

    protected Senha() {
    }

    public Senha(String senha) {
        if (senha.length() < 8) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 8 caracteres");
        }
        this.hash = new BCryptPasswordEncoder().encode(senha);
    }

    private String hash;

    public boolean validarSenha(String senha) {
        return new BCryptPasswordEncoder().matches(senha, this.hash);
    }

    public String getHash() {
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Senha senha1 = (Senha) o;
        return Objects.equals(hash, senha1.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

}
