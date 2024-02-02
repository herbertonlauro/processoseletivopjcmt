package com.herbertonpjcmt.dto;

import com.herbertonpjcmt.model.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
public class CidadeDTO {


    private Integer id;

    @Schema(example = "São Paulo", required = true)
    private String nome;

    @Schema(example = "SP", required = true)
    private String uf;

}
