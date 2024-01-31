package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pessoa")
@Setter
@Getter
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_id")
    private Long id;

    @Column(name = "pes_nome")
    private String nome;

    @Column(name = "pes_data_nascimento")
    private LocalDate datanascimento;

    @Column(name = "pes_sexo")
    private String sexo;

    @Column(name = "pes_mae")
    private String pes_pai;

}
