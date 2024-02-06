package com.herbertonpjcmt.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class ServidorEfetivoDTO {


    private String matricula;

    private String nome;

    private LocalDate datanascimento;

    private String sexo;

    private String mae;

    private String pai;
}
