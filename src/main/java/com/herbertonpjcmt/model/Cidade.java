package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cidade")
@Getter
@Setter
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid_id")
    private Integer id;

    @Column(name = "cid_nome", length = 200)
    private String nome;

    @Column(name = "cid_uf", length = 2)
    private String uf;

    @OneToMany(mappedBy = "cidade")
    private Set<Endereco> endereco;
}
