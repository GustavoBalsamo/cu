package br.com.uniamerica.projeto.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@SpringBootApplication
@Data
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Column(columnDefinition = "serial")
    private long id;

    private LocalDateTime cadastrado;

    private LocalDateTime atualizado;

    private boolean ativo;
}