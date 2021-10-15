package br.com.alura.orange.emailsender.kafka;

import br.com.alura.orange.emailsender.email.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

    @Autowired
    private EmailRepository repository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(ObjetoRespostaBroker objetoRespostaBroker) {
        this.repository.save(objetoRespostaBroker.toModel());
    }
}
