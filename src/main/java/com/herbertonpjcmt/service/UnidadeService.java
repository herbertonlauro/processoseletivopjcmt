package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.mappers.UnidadeMapper;
import com.herbertonpjcmt.model.Unidade;
import com.herbertonpjcmt.repository.UnidadeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UnidadeService {

    @Inject
    UnidadeRepository unidadeRepository;

    @Inject
    UnidadeMapper unidadeMapper;

    public List<UnidadeDTO> listDTO = new ArrayList<>();
    List<Unidade> listaUnidade = unidadeRepository.listAll();

}
