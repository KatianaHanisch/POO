package com.apicomsqlite.poo.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Pessoa {

    @Id
    private int id;

    private String nomePessoa;

    private String tipoPessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
