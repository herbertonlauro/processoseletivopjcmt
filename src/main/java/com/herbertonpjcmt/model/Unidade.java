package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "unidade")
@Setter
@Getter
@NoArgsConstructor
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unid_id")
    private Long id;

    @Column(name = "unid_nome")
    private String nome;

    @Column(name = "unid_sigla")
    private String sigla;

    @OneToMany(mappedBy = "unidade")
    private List<Lotacao> lotacao;

    @ManyToOne
    @JoinTable(name = "unidade_endereco", joinColumns = @JoinColumn(name = "unid_id"), inverseJoinColumns = @JoinColumn(name = "end_id"))
    private Endereco enderecos;

}

