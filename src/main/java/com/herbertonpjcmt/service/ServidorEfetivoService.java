package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.ServidorEfetivoDTO;
import com.herbertonpjcmt.mappers.ServidorEfetivoMapper;
import com.herbertonpjcmt.model.ServidorEfetivo;
import com.herbertonpjcmt.repository.ServidorEfetivoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
@ApplicationScoped
public class ServidorEfetivoService {

    @Inject
    ServidorEfetivoRepository servidorRepository;
    @Inject
    ServidorEfetivoMapper servidorMapper;

    public List<ServidorEfetivoDTO> listar(){
        List<ServidorEfetivo> servidorEfetivos = servidorRepository.listAll();
        return servidorEfetivos.stream().map(servidorMapper::toDTO).toList();
    }

    @Transactional
    public ServidorEfetivoDTO inserir(ServidorEfetivoDTO servidorEfetivoDTO){
        ServidorEfetivo efetivoDTO = servidorMapper.toEntity(servidorEfetivoDTO);
        servidorRepository.persist(efetivoDTO);
        return servidorMapper.toDTO(efetivoDTO);
    }

}
