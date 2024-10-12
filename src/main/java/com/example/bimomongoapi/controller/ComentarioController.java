package com.example.bimomongoapi.controller;

import com.example.bimomongoapi.model.Comentario;
import com.example.bimomongoapi.service.ComentarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bimomongoapi/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/todas")
    @Operation(summary = "Listar todos os comentarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de comentarios"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public List<Comentario> listarTodos() {
        return comentarioService.buscarTodos();
    }

    @PostMapping("/inserir")
    @Operation(summary = "Inserir um novo comentario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Comentario inserido com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    public Comentario inserir(@RequestBody Comentario comentario) {
        return comentarioService.inserir(comentario);
    }

    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deletar um comentario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Comentario deletado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Comentario não encontrado")
    })
    public void deletar(@PathVariable String id) {
        comentarioService.deletar(id);
    }
}
