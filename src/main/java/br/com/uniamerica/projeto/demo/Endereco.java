package br.com.uniamerica.projeto.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "tb_endereco", schema = "public")
public class Endereco extends AbstractEntity {

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "cep", length = 8, nullable = false, unique = false)
    private String cep;

    @Column(name = "numero", length = 20, nullable = false)
    private String endereco;

    @Column(name = "bairro", length = 60, nullable = false)
    private String bairro;
}