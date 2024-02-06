package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.ServidorEfetivoDTO;
import com.herbertonpjcmt.model.ServidorEfetivo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface ServidorEfetivoMapper {

    ServidorEfetivoDTO servidortoDTO(ServidorEfetivo servidorEfetivo);

    @Mapping(target = "id", ignore = true)
    ServidorEfetivo DTOtoservidorE(ServidorEfetivoDTO servidorEfetivoDTO);

    void upServidor (@MappingTarget ServidorEfetivo servidorEfetivo, ServidorEfetivoDTO servidorEfetivoDTO);

}
