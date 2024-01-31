package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Table(name = "servidor_temporario")
public class ServidorTemporario extends Pessoa{

    @Column(name = "st_data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "st_data_demissao")
    private LocalDate DataDemissao;

    @Column(name = "pes_id")
    private Pessoa pessoa;

}
