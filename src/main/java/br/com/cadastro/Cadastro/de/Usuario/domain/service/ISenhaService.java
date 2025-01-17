package br.com.cadastro.Cadastro.de.Usuario.domain.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.form.SenhaForm;

public interface ISenhaService {

    void atualizarSenhaPorIdUsuario(Long id_usuario, SenhaForm senha);

}
