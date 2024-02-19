package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.LotacaoDTO;
import com.herbertonpjcmt.mappers.LotacaoMapper;
import com.herbertonpjcmt.model.Lotacao;
import com.herbertonpjcmt.repository.LotacaoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

public class LotacaoService {

    @Inject
    LotacaoRepository lotacaoRepository;

    @Inject
    LotacaoMapper lotacaoMapper;

    public List<LotacaoDTO> listar(){
        List<Lotacao> lotacaos = lotacaoRepository.listAll();
        return lotacaos.stream().map(lotacaoMapper::toDTO).toList();
    }
    @Transactional
    public LotacaoDTO inserir(LotacaoDTO lotacaoDTO){
        Lotacao lotacao = lotacaoMapper.toEntity(lotacaoDTO);
        lotacaoRepository.persist(lotacao);
        return lotacaoMapper.toDTO(lotacao);
    }
    @Transactional
    public LotacaoDTO editar(Long id, LotacaoDTO lotacaoDTO ){
        Lotacao lotacao = lotacaoRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("não encontrado"));
        lotacaoMapper.uptoDTO(lotacao, lotacaoDTO);
        lotacaoRepository.persist(lotacao);
        return lotacaoMapper.toDTO(lotacao);
    }
    @Transactional
    public void deletar(Long id){
        Lotacao lotacao = lotacaoRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("não encontrado"));
        lotacaoRepository.delete(lotacao);
    }
}
