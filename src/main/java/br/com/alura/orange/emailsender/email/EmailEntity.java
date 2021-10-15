package br.com.alura.orange.emailsender.email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class EmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotBlank
    private String emailDestinatario;

    @NotBlank
    private String mensagem;

    private LocalDateTime dataHoraEnvio = LocalDateTime.now();

    @Deprecated
    public EmailEntity() {}

    public EmailEntity(@NotBlank String emailDestinatario, @NotBlank String mensagem) {
        this.emailDestinatario = emailDestinatario;
        this.mensagem = mensagem;
    }
}
