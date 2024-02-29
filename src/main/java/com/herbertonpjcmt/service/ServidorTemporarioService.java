package com.herbertonpjcmt.service;

import com.herbertonpjcmt.dto.ServidorTemporarioDTO;
import com.herbertonpjcmt.mappers.ServidorTemporarioMapper;
import com.herbertonpjcmt.model.ServidorTemporario;
import com.herbertonpjcmt.repository.ServidorTemporarioRepository;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

public class ServidorTemporarioService {

    @Inject
    ServidorTemporarioMapper servidorMapper;
    @Inject
    ServidorTemporarioRepository servidorTemporarioRepository;

    public List<ServidorTemporarioDTO> listar(){
        List<ServidorTemporario> servidor = servidorTemporarioRepository.listAll();
        return servidor.stream().map(servidorMapper::toDTO).collect(Collectors.toList());
    }

}
