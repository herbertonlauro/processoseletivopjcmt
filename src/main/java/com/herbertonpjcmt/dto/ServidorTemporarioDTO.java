package com.herbertonpjcmt.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ServidorTemporarioDTO {


    private LocalDate dataAdmissao;

    private LocalDate DataDemissao;

    private String nome;

    private LocalDate datanascimento;

    private String sexo;

    private String mae;

    private String pai;
}
