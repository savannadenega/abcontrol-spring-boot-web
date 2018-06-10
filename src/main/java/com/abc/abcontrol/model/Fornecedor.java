/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.abcontrol.model;

import java.sql.Timestamp;

/**
 *
 * @author Cássio Linden
 */
public class Fornecedor {
    private int id;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private Timestamp dataFundacao;
    private String endereco;
    private String telefonePrincipal;
    private String telefoneSecundario;
    private String eMail;

    public Fornecedor(int id, String razaoSocial, String nomeFantasia, String cnpj, Timestamp dataFundacao, String endereco, String telefonePrincipal, String telefoneSecundario, String eMail) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneSecundario = telefoneSecundario;
        this.eMail = eMail;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Timestamp getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Timestamp dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }

    public void setTelefoneSecundario(String telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    
}
