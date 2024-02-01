package com.herbertonpjcmt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "seridor_efetivo")
public class ServidorEfetivo extends Pessoa {

    @Column(name = "se_matricula", length = 20)
    private String matricula;

    @Column(name = "pes_id")
    private Pessoa pessoa;

}
