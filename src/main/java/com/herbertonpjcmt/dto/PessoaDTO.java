package com.herbertonpjcmt.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PessoaDTO {

    private Long id;

    private String nome;

    private LocalDate datanascimento;

    private String sexo;

    private String mae;

    private String pai;

}
