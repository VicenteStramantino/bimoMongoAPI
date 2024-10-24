package com.example.bimomongoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "postagem")
public class Postagem {

    @Id
    private String id;
    private String cID;
    private int iIdUsuario;
    private String cTexto;
    private String cImgFirebase;

    private int iCurtidas;


    public Postagem(String cID, int iIdUsuario, String cTexto, String cImgFirebase) {
        this.cID = cID;
        this.iIdUsuario = iIdUsuario;
        this.cTexto = cTexto;
        this.cImgFirebase = cImgFirebase;
        this.iCurtidas = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcID() {
        return cID;
    }

    public void setsID(String cID) {
        this.cID = cID;
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

    public String getcImgFirebase() {
        return cImgFirebase;
    }

    public void setcImgFirebase(String cImgFirebase) {
        this.cImgFirebase = cImgFirebase;
    }

    public int getiCurtidas() {
        return iCurtidas;
    }

    public void setiCurtidas(int iCurtidas) {
        this.iCurtidas = iCurtidas;
    }
}
