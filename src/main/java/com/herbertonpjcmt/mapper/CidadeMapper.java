package com.herbertonpjcmt.mapper;

import com.herbertonpjcmt.dto.CidadeDTO;
import com.herbertonpjcmt.model.Cidade;
import org.mapstruct.*;

import javax.swing.*;

@Mapper
public interface CidadeMapper {

    CidadeDTO cidadeToDto(Cidade cidade);

    @Mapping(target = "id", ignore = true)
    @InheritInverseConfiguration
    Cidade DtoToCidade(CidadeDTO cidadeDTO);

    @Mapping(target = "id", ignore = true)
    @InheritInverseConfiguration
    Cidade upCidadeDTO(@MappingTarget Cidade cidade, CidadeDTO cidadeDTO);

}
