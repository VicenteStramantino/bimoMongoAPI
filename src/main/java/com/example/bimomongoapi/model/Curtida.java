package com.example.bimomongoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "curtida")
public class Curtida {

    @Id
    private String id;
    private int iIdPostagem;
    private int iIdUsuario;


    public Curtida(String id, int iIdPostagem, int iIdUsuario) {
        this.id = id;
        this.iIdPostagem = iIdPostagem;
        this.iIdUsuario = iIdUsuario;
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

    @Override
    public String toString() {
        return "Curtida{" +
                "id='" + id + '\'' +
                ", iIdPostagem=" + iIdPostagem +
                ", iIdUsuario=" + iIdUsuario +
                '}';
    }
}
