package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "endereco")
@Setter
@Getter
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_id")
    private Long id;

    @Column(name="end_tipo_logradouro")
    private String tipoLogradouro;

    @Column(name="end_logradouro")
    private String logradouro;

    @Column(name="end_numero")
    private int numero;

    @Column(name="end_bairro")
    private String bairro;

    @ManyToOne()
    @JoinColumn(name = "cid_id")
    private Cidade cidade;



}
