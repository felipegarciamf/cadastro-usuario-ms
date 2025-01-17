package br.com.cadastro.Cadastro.de.Usuario.applcation.dto;

import br.com.cadastro.Cadastro.de.Usuario.domain.entity.vo.Endereco;

public record EnderecoDto(
        String cep,
        String rua,
        String cidade,
        String estado,
        String numero
) {

    // Construtor customizado para criar EnderecoDto a partir de Endereco
    public EnderecoDto(Endereco endereco) {
        this(
                endereco.getCep(),
                endereco.getRua(),
                endereco.getCidade(),
                endereco.getEstado(),
                endereco.getNumero()
        );
    }

    // Método para converter EnderecoDto de volta para Endereco
    public Endereco converter() {
        Endereco endereco = new Endereco();
        endereco.setCep(this.cep);
        endereco.setCidade(this.cidade);
        endereco.setRua(this.rua);
        endereco.setEstado(this.estado);
        endereco.setNumero(this.numero);
        return endereco;
    }
}
