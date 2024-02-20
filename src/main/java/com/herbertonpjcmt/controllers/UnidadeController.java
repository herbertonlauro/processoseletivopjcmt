package com.herbertonpjcmt.controllers;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.service.UnidadeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.net.URI;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/unidades")
@Tag(name = "Unidades")
public class UnidadeController {

    @Inject
    UnidadeService unidadeService;


    @GET
    public List<UnidadeDTO> listar(){
        return unidadeService.listar();
    }

    @Operation(summary = "Cadastro de unidade", description = "Cadastrar unidade")
    @POST
    public Response criar(@RequestBody UnidadeDTO unidadeDTO){
        UnidadeDTO unidade = unidadeService.inserir(unidadeDTO);
        return Response.created(URI.create("/unidades")).entity(unidade).build();
    }
}

