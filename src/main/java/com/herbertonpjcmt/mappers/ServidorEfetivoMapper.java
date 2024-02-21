package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.ServidorEfetivoDTO;
import com.herbertonpjcmt.model.ServidorEfetivo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface ServidorEfetivoMapper {

    ServidorEfetivoDTO toDTO(ServidorEfetivo servidorEfetivo);


    @Mapping(target = "id", ignore = true)
    ServidorEfetivo toEntity(ServidorEfetivoDTO servidorEfetivoDTO);

    void uptoDTO (@MappingTarget ServidorEfetivo servidorEfetivo, ServidorEfetivoDTO servidorEfetivoDTO);

}
