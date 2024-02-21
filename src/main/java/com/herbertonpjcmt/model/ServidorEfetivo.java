package com.herbertonpjcmt.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "seridor_efetivo")
@Getter
@Setter
public class ServidorEfetivo extends Pessoa {

    @Column(name = "se_matricula", length = 20)
    private String matricula;

    @OneToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

}
