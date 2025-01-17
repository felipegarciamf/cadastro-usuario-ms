package br.com.cadastro.Cadastro.de.Usuario.applcation.form;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.EnderecoDto;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;
import jakarta.persistence.Embedded;

public class UsuarioForm {

    private String nome;

    private String sobrenome;

    @Embedded
    private EnderecoForm endereco;

    private SenhaForm senha;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public EnderecoForm getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoForm endereco) {
        this.endereco = endereco;
    }

    public Usuario converter() {
        Endereco endereco = new Endereco(this.endereco.getCep(), this.endereco.getRua(), this.endereco.getCidade(), this.endereco.getEstado(), this.endereco.getNumero());
        Senha senha = new Senha(this.senha.getSenha());
        return new Usuario(this.nome, this.sobrenome, endereco, senha);
    }


}
