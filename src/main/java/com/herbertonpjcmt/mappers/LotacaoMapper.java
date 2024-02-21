package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.LotacaoDTO;
import com.herbertonpjcmt.model.Lotacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface LotacaoMapper {
        LotacaoDTO toDTO(Lotacao Lotacao);

        @Mapping(target = "id", ignore = true)
        Lotacao toEntity(LotacaoDTO lotacaoDTO);

        @Mapping(target = "id", ignore = true)
        Lotacao uptoDTO(@MappingTarget Lotacao lotacao, LotacaoDTO lotacaoDTO);
}
