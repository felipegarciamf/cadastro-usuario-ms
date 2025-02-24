package br.com.cadastro.Cadastro.de.Usuario.applcation.form;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.EnderecoDto;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.Usuario;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Contatos;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;
import jakarta.persistence.Embedded;

public class UsuarioForm {

    private String nome;

    private String sobrenome;

    private EnderecoForm endereco;

    private SenhaForm senha;

    private ContatosForm contatos;


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

    public SenhaForm getSenha() {
        return senha;
    }

    public void setSenha(SenhaForm senha) {
        this.senha = senha;
    }

    public ContatosForm getContatos() {
        return contatos;
    }

    public void setContatos(ContatosForm contatos) {
        this.contatos = contatos;
    }

    public Usuario converter() {
        Endereco endereco = new Endereco(this.endereco.getCep(), this.endereco.getRua(), this.endereco.getCidade(), this.endereco.getEstado(), this.endereco.getNumero());
        Senha senha = new Senha(this.senha.getSenha());
        new Contatos(this.contatos.getEmail(), this.contatos.getTelefone())
        return new Usuario(this.nome, this.sobrenome, endereco, senha, contatos);
    }

}
