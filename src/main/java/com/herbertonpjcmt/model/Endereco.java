package com.herbertonpjcmt.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long end_id;
    public String end_tipo_logradouro;
    public String end_logradouro;
    public int end_numero;
    public String end_bairro;



}
