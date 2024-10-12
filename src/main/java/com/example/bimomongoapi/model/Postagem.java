package com.example.bimomongoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "postagem")
public class Postagem {

    @Id
    private String id;
    private int sID;
    private int iIdUsuario;
    private String cTexto;
    private String cImgFirebase;


    public Postagem(String id, int sID, int iIdUsuario, String cTexto, String cImgFirebase) {
        this.id = id;
        this.sID = sID;
        this.iIdUsuario = iIdUsuario;
        this.cTexto = cTexto;
        this.cImgFirebase = cImgFirebase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
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


}
