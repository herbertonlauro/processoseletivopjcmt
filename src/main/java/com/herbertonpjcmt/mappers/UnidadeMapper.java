package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.model.Unidade;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface UnidadeMapper {

    UnidadeDTO unidadeToDTO(Unidade unidade);

    @Mapping(target = "id", ignore = true)
    Unidade DTOtoUnidade(UnidadeDTO unidadeDTO);

    @Mapping(target = "id", ignore = true)
    Unidade upUnidadeDTO(@MappingTarget Unidade unidade, UnidadeDTO unidadeDTO);
}
