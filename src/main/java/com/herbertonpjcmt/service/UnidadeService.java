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
import java.util.stream.Collectors;

@ApplicationScoped
public class UnidadeService {

    @Inject
    UnidadeMapper unidadeMapper;

    @Inject
    UnidadeRepository unidadeRepository;

    public List<UnidadeDTO> listar(){
        List<Unidade> unidades = new ArrayList<>();
        return unidades.stream().map(unidadeMapper::unidadeToDTO).collect(Collectors.toList());
    }

    public UnidadeDTO inserir(UnidadeDTO unidadeDTO){
        Unidade unidade = unidadeMapper.DTOtoUnidade(unidadeDTO);
        unidadeRepository.persist(unidade);
        return unidadeMapper.unidadeToDTO(unidade);
    }


}
