package com.abc.abcontrol.model;

import java.util.Calendar;
import java.util.Date;

public class Projeto{

    private int id;
    private String nome;
    private String tipoProjeto;
    private String statusProjeto;
    private String dataInicial; //TODO Date
    private String previsaoTermino; //TODO Date

    public Projeto(int id, String nome, String tipoProjeto, String statusProjeto, String dataInicial, String previsaoTermino) {
        this.id = id;
        this.nome = nome;
        this.tipoProjeto = tipoProjeto;
        this.statusProjeto = statusProjeto;
        this.dataInicial = dataInicial;
        this.previsaoTermino = previsaoTermino;
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

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getStatusProjeto() {
        return statusProjeto;
    }

    public void setStatusProjeto(String statusProjeto) {
        this.statusProjeto = statusProjeto;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getPrevisaoTermino() {
        return previsaoTermino;
    }

    public void setPrevisaoTermino(String previsaoTermino) {
        this.previsaoTermino = previsaoTermino;
    }
}
