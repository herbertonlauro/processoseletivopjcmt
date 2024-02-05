package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.CidadeDTO;
import com.herbertonpjcmt.mapper.CidadeMapper;
import com.herbertonpjcmt.model.Cidade;
import com.herbertonpjcmt.repository.CidadeRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CidadeService {

    @Inject
    CidadeRepository cidadeRepository;

    @Inject
    CidadeMapper cidadeMapper;

    public List<CidadeDTO> listarcidade(){
    List<CidadeDTO> Listacidade = new ArrayList<>();
    List<Cidade> cidades = cidadeRepository.listAll();
    for (Cidade cidade : cidades){
        CidadeDTO dto = cidadeMapper.cidadeToDto(cidade);
        Listacidade.add(dto);
    }
        return Listacidade;
    }

    public CidadeDTO criar(CidadeDTO cidadeDTO){
        Cidade cidade = cidadeMapper.DtoToCidade(cidadeDTO);
        cidadeRepository.persist(cidade);
        return cidadeMapper.cidadeToDto(cidade);
    }

    public CidadeDTO editar(Long id, CidadeDTO objDTO){
        Cidade cidade = cidadeRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("Não encontrado"));
        cidadeMapper.upCidadeDTO(cidade, objDTO);
        cidadeRepository.persist(cidade);
        return cidadeMapper.cidadeToDto(cidade);
    }

    public void deletar(Long id){
        Cidade cidade = cidadeRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("não encotrado"));
        if (cidade == null){
            throw new RuntimeException(" campo vazio");
        }
        cidadeRepository.delete(cidade);
    }


}
