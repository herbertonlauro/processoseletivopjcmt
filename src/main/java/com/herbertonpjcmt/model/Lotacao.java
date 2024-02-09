package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "lotacao")
@Setter
@Getter
@NoArgsConstructor
public class Lotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lot_id")
    private Long id;

    @Column(name = "lot_data_lotacao")
    private LocalDate datalotacao;

    @Column(name = "lot_data_remocao")
    private LocalDate dataremocao;

    @Column(name = "lot_portaria", length = 100)
    private String portaria;

    @OneToOne()
    @JoinColumn(name = "uni_id")
    private  Unidade unidade;

    @ManyToOne()
    @JoinColumn(name = "pes_id")
    private  Pessoa pessoa;
}
