package com.herbertonpjcmt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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

    @Column(name = "pes_nome", length = 200)
    private String nome;

    @Column(name = "pes_data_nascimento")
    private LocalDate datanascimento;

    @Column(name = "pes_sexo", length = 9)
    private String sexo;

    @Column(name = "pes_mae", length = 200)
    private String mae;

    @Column(name = "pes_pai", length = 200)
    private String pai;

//    @ManyToMany
//    @JoinTable(name = "pessoa_endereco", joinColumns = @JoinColumn(name = "pes_id"), inverseJoinColumns = @JoinColumn(name = "end_id"))
//    private Set<Endereco> endereco;
//
//    @OneToMany
//    @JoinColumn(name = "pessoa")
//    private List<FotoPessoa> fotoPessoas;

}
