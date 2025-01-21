package br.com.cadastro.Cadastro.de.Usuario.domain.entity;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Contatos;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;
import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Senha;
import jakarta.persistence.*;


@Entity
public class Usuario {

    public Usuario(){

    }

    public Usuario(String nome, String sobrenome, Endereco endereco, Senha senha, Contatos contatos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.senha = senha;
        this.contatos = contatos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dataNascimento;

    private String genero;

    private String sobrenome;

    @Embedded
    private Senha senha;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Contatos contatos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }
}
