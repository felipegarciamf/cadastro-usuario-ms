package br.com.cadastro.Cadastro.de.Usuario.infra.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "apiOpenAi", url="")
public interface OpenApiClient {


    @GetMapping("/teste")
    String getDados();

}
