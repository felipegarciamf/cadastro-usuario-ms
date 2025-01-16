package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;

public class EnderecoDto {

    public EnderecoDto(Endereco endereco) {
        this.cep = endereco.getCep();
        this.rua = endereco.getRua();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.numero = endereco.getNumero();
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

    public Endereco converter(){
        Endereco endereco = new Endereco();
        endereco.setCep(this.cep);
        endereco.setCidade(this.cidade);
        endereco.setRua(this.rua);
        endereco.setEstado(this.estado);
        endereco.setNumero(this.numero);

        return endereco;
    }
}
