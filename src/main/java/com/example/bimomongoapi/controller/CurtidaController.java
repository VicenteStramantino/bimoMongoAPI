package com.example.bimomongoapi.controller;

import com.example.bimomongoapi.model.Curtida;
import com.example.bimomongoapi.service.CurtidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bimomongoapi/curtidas")
public class CurtidaController {
    @Autowired
    private CurtidaService curtidaService;

    @GetMapping("/todas")
    @Operation(summary = "Listar todas as curtidas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de curtidas"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public List<Curtida> listarTodas() {
        return curtidaService.buscarTodas();
    }

    @PostMapping("/inserir")
    @Operation(summary = "Inserir uma nova postagem")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Postagem inserida com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public Curtida inserir(@RequestBody Curtida curtida) {
        return curtidaService.inserir(curtida);
    }

    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deletar uma postagem")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Postagem deletada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Postagem não encontrada")
    })
    public void deletar(@PathVariable String id) {
        curtidaService.deletar(id);
    }
}
