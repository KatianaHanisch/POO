package com.apicomsqlite.poo.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contrato {

    @Id
    private int id;

    private String nomeContrato;

    private int idCliente;

    private int idVendedor;

    private int idProduto;

    private int quantidade;

    private double valorTotal;

    private String moeda;

    private String formaPagamento;

    private boolean contratoPago;

    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeContrato() {
        return nomeContrato;
    }

    public void setNomeContrato(String nomeContrato) {
        this.nomeContrato = nomeContrato;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public boolean getContratoPago() {
        return contratoPago;
    }

    public void setContratoPago(boolean contratoPago) {
        this.contratoPago = contratoPago;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", idCliente='" + idCliente + '\'' +
                ", idVendedor='" + idVendedor + '\'' +
                ", idProduto='" + idProduto + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", moeda='" + moeda + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                '}';
    }
}