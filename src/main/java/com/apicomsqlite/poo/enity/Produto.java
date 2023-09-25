package com.apicomsqlite.poo.enity;

import jakarta.persistence.Id;

public class Produto {
    @Id
    private int id;

    private String nome;

    private String unidadeDeMedida;

    private int quantidade;

    private double valor;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", unidade de medida='" + unidadeDeMedida + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
