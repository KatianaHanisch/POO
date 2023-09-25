package com.apicomsqlite.poo.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contrato {

    @Id
    private int id;

    private String cliente;

    private String vendedor;

    private String produto;

    private int quantidade;

    private double valorTotal;

    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", vendedor='" + vendedor + '\'' +
                ", produto='" + produto + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                '}';
    }
}