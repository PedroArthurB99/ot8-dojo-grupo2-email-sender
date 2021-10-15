package br.com.alura.orange.emailsender.kafka;

import br.com.alura.orange.emailsender.email.EmailEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ObjetoRespostaBroker {

    @Email
    @NotBlank
    private String emailDestinatario;

    @NotBlank
    private String mensagem;

    public EmailEntity toModel() {
        return new EmailEntity(this.emailDestinatario, this.mensagem);
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public String getMensagem() {
        return mensagem;
    }
}
