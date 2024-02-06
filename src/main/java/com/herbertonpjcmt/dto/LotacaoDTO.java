package com.herbertonpjcmt.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LotacaoDTO {

    private Long id;
    private LocalDate datalotacao;
    private LocalDate dataremocao;
    private String portaria;
}
