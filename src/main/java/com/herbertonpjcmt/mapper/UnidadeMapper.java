package com.herbertonpjcmt.mapper;

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
    Unidade upLotacaoDTO(@MappingTarget Unidade unidade, UnidadeDTO unidadeDTO);
}
