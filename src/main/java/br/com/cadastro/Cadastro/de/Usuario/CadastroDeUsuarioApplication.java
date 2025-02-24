package br.com.cadastro.Cadastro.de.Usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CadastroDeUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeUsuarioApplication.class, args);
	}

}
