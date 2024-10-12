package com.example.bimomongoapi.controller;

import com.example.bimomongoapi.model.Postagem;
import com.example.bimomongoapi.service.PostagemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bimomongoapi/postagens")
public class PostagemController {
    @Autowired
    private PostagemService postagemService;

    @GetMapping("/todas")
    @Operation(summary = "Listar todas as postagens")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de postagens"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public List<Postagem> listarTodos() {
        return postagemService.buscarTodas();
    }


    @PostMapping("/inserir")
    @Operation(summary = "Inserir uma nova curtida")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Curtida inserida com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public Postagem inserir(@RequestBody Postagem postagem) {
        return postagemService.inserir(postagem);
    }

    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deletar uma curtida")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = " deletada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Postagem não encontrada")
    })
    public void deletar(@PathVariable String id) {
        postagemService.deletar(id);
    }
}
