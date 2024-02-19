package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.model.Unidade;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface UnidadeMapper {

    UnidadeDTO toDTO(Unidade unidade);

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    Unidade toEntity(UnidadeDTO unidadeDTO);

    @Mapping(target = "id", ignore = true)
    Unidade uptoDTO(@MappingTarget Unidade unidade, UnidadeDTO unidadeDTO);
}
