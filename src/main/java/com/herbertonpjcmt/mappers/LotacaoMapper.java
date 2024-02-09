package com.herbertonpjcmt.mappers;

import com.herbertonpjcmt.dto.LotacaoDTO;
import com.herbertonpjcmt.model.Lotacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface LotacaoMapper {
        LotacaoDTO lotacaoToDTO(Lotacao Lotacao);

        @Mapping(target = "id", ignore = true)
        Lotacao DTOtoLotacao(LotacaoDTO lotacaoDTO);

        @Mapping(target = "id", ignore = true)
        Lotacao upLotacaoToDTO(@MappingTarget Lotacao lotacao, LotacaoDTO lotacaoDTO);
}