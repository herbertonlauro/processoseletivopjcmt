package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.ServidorTemporarioDTO;
import com.herbertonpjcmt.model.ServidorTemporario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface ServidorTemporarioMapper {

    ServidorTemporarioDTO toDTO(ServidorTemporario servidorTemporario);

    @Mapping(target = "id", ignore = true)
    ServidorTemporario toEntity(ServidorTemporarioDTO servidorTemporarioDTO);


    void uptoDTO(@MappingTarget ServidorTemporario servidorTemporario, ServidorTemporarioDTO servidorTemporarioDTO);


}
