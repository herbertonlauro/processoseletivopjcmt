package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.model.Unidade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface UnidadeMapper {

    UnidadeDTO toDTO(Unidade unidade);

    @Mapping(target = "id", ignore = true)
    Unidade toEntity(UnidadeDTO unidadeDTO);

    @Mapping(target = "id", ignore = true)
    Unidade uptoDTO(@MappingTarget Unidade unidade, UnidadeDTO unidadeDTO);
}
