package com.herbertonpjcmt.controllers;

import com.herbertonpjcmt.dto.UnidadeDTO;
import com.herbertonpjcmt.service.UnidadeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

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

}
