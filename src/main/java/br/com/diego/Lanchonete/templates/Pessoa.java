package br.com.diego.Lanchonete.templates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded=true)
@MappedSuperclass
public abstract class Pessoa {
    @Column(length=11, nullable=false)
    @EqualsAndHashCode.Include
    protected String cpf;

    @Column(length=50, nullable=false)
    @JsonProperty("name")
    protected String nome;

    @Column(length=13)
    @JsonProperty("phone")
    protected String telefone;

    @Column(length=40, nullable=false)
    protected String email;

    // @JsonProperty("birth")
    @JsonIgnore
    protected LocalDate dataNascimento;
}