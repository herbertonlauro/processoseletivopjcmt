package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.ServidorEfetivoDTO;
import com.herbertonpjcmt.mappers.ServidorEfetivoMapper;
import com.herbertonpjcmt.model.ServidorEfetivo;
import com.herbertonpjcmt.repository.ServidorEfetivoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

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
    @Transactional
    public ServidorEfetivoDTO editar(Long id, ServidorEfetivoDTO servidorEfetivoDTO){
        ServidorEfetivo servidor = servidorRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("Não encontrado"));
        servidorMapper.uptoDTO(servidor,servidorEfetivoDTO);
        servidorRepository.persist(servidor);
        return servidorMapper.toDTO(servidor);
    }
    @Transactional
    public void deletar(Long id){
        ServidorEfetivo servidor = servidorRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("Não encontrado"));
        servidorRepository.delete(servidor);
    }
}
