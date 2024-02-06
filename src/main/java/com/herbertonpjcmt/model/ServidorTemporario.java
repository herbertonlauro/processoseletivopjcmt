package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "servidor_temporario")
@Getter
@Setter
public class ServidorTemporario extends Pessoa{

    @Column(name = "st_data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "st_data_demissao")
    private LocalDate DataDemissao;


}
