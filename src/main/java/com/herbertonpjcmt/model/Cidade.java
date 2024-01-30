package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Setter;
@Entity
@Table(name = "Cidade")
@Setter
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cid_nome;
    private String cid_uf;

    @ManyToOne
    private Endereco endereco;

}
