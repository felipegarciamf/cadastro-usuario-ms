package br.com.cadastro.Cadastro.de.Usuario.applcation.service;

import br.com.cadastro.Cadastro.de.Usuario.applcation.dto.EventoUsuarioDto;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioEventPublisher {

    private final KafkaTemplate<String, EventoUsuarioDto>  kafkaTemplate;

    public UsuarioEventPublisher(KafkaTemplate<String, EventoUsuarioDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishUsuarioCriado(EventoUsuarioDto evento){
        kafkaTemplate.send(
                MessageBuilder.withPayload(evento)
                        .setHeader(KafkaHeaders.TOPIC, "user-created-topic")
                        .setHeader("__TypeId__", "br.com.servico.de.autenticacao.application.dto.EventoUsuarioDto")
                        .build()
        );
        System.out.println("Mensagem enviada ao Kafka: " + evento);
    }
}
