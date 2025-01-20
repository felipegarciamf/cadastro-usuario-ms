package br.com.cadastro.Cadastro.de.Usuario.applcation.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.EventoUsuarioDto;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEventPublisher {

    private final KafkaTemplate<String, EventoUsuarioDto>  kafkaTemplate;

    public UsuarioEventPublisher(KafkaTemplate<String, EventoUsuarioDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishUsuarioCriado(EventoUsuarioDto evento){
        kafkaTemplate.send("user-created-topic", evento);
        System.out.println("Evento de usuário criado e enviado ao KAFKA " + evento);
    }
}
