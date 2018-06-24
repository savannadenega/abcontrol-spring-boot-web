/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.abcontrol.model;


/**
 *
 * @author Cássio Linden
 */
public class Material {
    private int id;
    private String fornecedor; //TO DO usar classe Fornecedor
    private String tipoMaterial;
    private String descricao;
    private String tipoUnidade;
    private double valorUnidade;

    public Material(int id, String fornecedor, String tipoMaterial, String descricao, String tipoUnidade, double valorUnidade) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.tipoMaterial = tipoMaterial;
        this.descricao = descricao;
        this.tipoUnidade = tipoUnidade;
        this.valorUnidade = valorUnidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
}