package com.abc.abcontrol.model;

import java.util.List;

public class Projeto{

    private int id;
    private String nome;
    private String tipoProjeto;
    private String statusProjeto;
    private String dataInicial; //TODO usar classe Date
    private String previsaoTermino; //TODO usar classe Date

    private List<String> obra; //TODO classe obra
    private List<String> tarefa; //TODO classe tarefa
    private List<String> anexo; //TODO classe anexo
    private List<String> equipe; //TODO classe equipe
    private List<String> orcamentoGeral; //TODO classe OrCamentoGeral
    private List<String> orcamentoSimulacaoGeral; //TODO classe OrcamentoSimulacaoGeral

    public Projeto(int id, String nome, String tipoProjeto, String statusProjeto, String dataInicial, String previsaoTermino, List<String> obra, List<String> tarefa, List<String> anexo, List<String> equipe, List<String> orcamentoGeral, List<String> orcamentoSimulacaoGeral) {
        this.id = id;
        this.nome = nome;
        this.tipoProjeto = tipoProjeto;
        this.statusProjeto = statusProjeto;
        this.dataInicial = dataInicial;
        this.previsaoTermino = previsaoTermino;
        this.obra = obra;
        this.tarefa = tarefa;
        this.anexo = anexo;
        this.equipe = equipe;
        this.orcamentoGeral = orcamentoGeral;
        this.orcamentoSimulacaoGeral = orcamentoSimulacaoGeral;
    }

    public Projeto(){

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

    public List<String> getObra() {
        return obra;
    }

    public void setObra(List<String> obra) {
        this.obra = obra;
    }

    public List<String> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<String> tarefa) {
        this.tarefa = tarefa;
    }

    public List<String> getAnexo() {
        return anexo;
    }

    public void setAnexo(List<String> anexo) {
        this.anexo = anexo;
    }

    public List<String> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<String> equipe) {
        this.equipe = equipe;
    }

    public List<String> getOrcamentoGeral() {
        return orcamentoGeral;
    }

    public void setOrcamentoGeral(List<String> orcamentoGeral) {
        this.orcamentoGeral = orcamentoGeral;
    }

    public List<String> getOrcamentoSimulacaoGeral() {
        return orcamentoSimulacaoGeral;
    }

    public void setOrcamentoSimulacaoGeral(List<String> orcamentoSimulacaoGeral) {
        this.orcamentoSimulacaoGeral = orcamentoSimulacaoGeral;
    }
}
