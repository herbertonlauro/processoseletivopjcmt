package com.herbertonpjcmt.mapper;

import com.herbertonpjcmt.dto.ServidorTemporarioDTO;
import com.herbertonpjcmt.model.ServidorTemporario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface ServidorTemporarioMapper {

    ServidorTemporarioDTO servidortoDTO(ServidorTemporario servidorTemporario);

    @Mapping(target = "id", ignore = true)
    ServidorTemporario DTOservidor(ServidorTemporarioDTO servidorTemporarioDTO);


    void upServidor(@MappingTarget ServidorTemporario servidorTemporario, ServidorTemporarioDTO servidorTemporarioDTO);


}
