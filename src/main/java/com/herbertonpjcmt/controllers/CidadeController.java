package com.herbertonpjcmt.controllers;

import com.herbertonpjcmt.dto.CidadeDTO;
import com.herbertonpjcmt.service.CidadeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/cidades")
@Tag(name = "Cidades")
public class CidadeController {

    @Inject
    CidadeService cidadeService;

    @Operation(summary = "Listar todos",description= "Lista todos as Cidades cadastrada")
    @GET
    public List<CidadeDTO> Listar(){
        return cidadeService.listarcidade();
    }
//    @Operation(summary = "Criar Cidade", description = "Cadastrar cidade")
//    @POST
}
