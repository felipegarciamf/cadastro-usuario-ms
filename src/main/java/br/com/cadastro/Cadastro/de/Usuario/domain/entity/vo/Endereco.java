package br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo;


import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    public Endereco(){

    }

    public Endereco(String cep, String rua, String cidade, String estado, String numero) {
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    private String cep;

    private String rua;

    private String cidade;

    private String estado;

    private String numero;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
