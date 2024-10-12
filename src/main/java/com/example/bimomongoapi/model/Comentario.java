package com.example.bimomongoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comentario")
public class Comentario {

    @Id
    private String id;
    private int iIdPostagem;
    private int iIdUsuario;
    private String cTexto;

    public Comentario(String id, int iIdPostagem, int iIdUsuario, String cTexto) {
        this.id = id;
        this.iIdPostagem = iIdPostagem;
        this.iIdUsuario = iIdUsuario;
        this.cTexto = cTexto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getiIdPostagem() {
        return iIdPostagem;
    }

    public void setiIdPostagem(int iIdPostagem) {
        this.iIdPostagem = iIdPostagem;
    }

    public int getiIdUsuario() {
        return iIdUsuario;
    }

    public void setiIdUsuario(int iIdUsuario) {
        this.iIdUsuario = iIdUsuario;
    }

    public String getcTexto() {
        return cTexto;
    }

    public void setcTexto(String cTexto) {
        this.cTexto = cTexto;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id='" + id + '\'' +
                ", iIdPostagem=" + iIdPostagem +
                ", iIdUsuario=" + iIdUsuario +
                ", cTexto='" + cTexto + '\'' +
                '}';
    }
}
