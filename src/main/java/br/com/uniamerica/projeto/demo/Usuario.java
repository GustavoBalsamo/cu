package br.com.uniamerica.projeto.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Data

@SpringBootApplication
@Entity
@Table(name = "tb_usuario", schema = "public")
public class Usuario extends AbstractEntity {

    @Column(name = "cpf", length = 15, nullable = false, unique = true)
    private String cpf;

    @Column(name = "nome", length = 65, nullable = false)
    private String nome;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

    @Column(name = "login", length = 35, nullable = false, unique = true)
    private String login;

    @OneToOne
    private Endereco endereco;

}

