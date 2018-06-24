package com.abc.abcontrol.Converter;

import com.abc.abcontrol.DTO.ProjetoDTO;
import com.abc.abcontrol.model.Projeto;

import java.util.ArrayList;
import java.util.List;


public class ProjetoConverter{

    public ProjetoConverter(){

    }

    public void converterProjetoDTO(Projeto projeto, ProjetoDTO projetoDTO){

        if (projetoDTO.getId() != 0){
            projeto.setId(projetoDTO.getId());
        }
        if (!projetoDTO.getNome().isEmpty()){
            projeto.setNome(projetoDTO.getNome());
        }
        if (!projetoDTO.getTipoProjeto().isEmpty()){
            projeto.setTipoProjeto(projetoDTO.getTipoProjeto());
        }
        if (!projetoDTO.getStatusProjeto().isEmpty()){
            projeto.setStatusProjeto(projetoDTO.getStatusProjeto());
        }
        if (!projetoDTO.getDataInicial().isEmpty()){
            projeto.setDataInicial(projetoDTO.getDataInicial());
        }
        if (!projetoDTO.getPrevisaoTermino().isEmpty()){
            projeto.setPrevisaoTermino(projetoDTO.getPrevisaoTermino());
        }

        List<String> obra = new ArrayList<>();
        if(!projetoDTO.getObra1().isEmpty()) {
            obra.add(projetoDTO.getObra1());
        }
        if(!projetoDTO.getObra2().isEmpty()) {
            obra.add(projetoDTO.getObra2());
        }
        if(!projetoDTO.getObra3().isEmpty()) {
            obra.add(projetoDTO.getObra3());
        }
        if(!projetoDTO.getObra4().isEmpty()) {
            obra.add(projetoDTO.getObra4());
        }
        if(!projetoDTO.getObra5().isEmpty()) {
            obra.add(projetoDTO.getObra5());
        }
        projeto.setObra(obra);

        List<String> tarefa = new ArrayList<>();
        if (!projetoDTO.getTarefa1().isEmpty()){
            tarefa.add(projetoDTO.getTarefa1());
        }
        if (!projetoDTO.getTarefa2().isEmpty()){
            tarefa.add(projetoDTO.getTarefa2());
        }
        if (!projetoDTO.getTarefa3().isEmpty()){
            tarefa.add(projetoDTO.getTarefa3());
        }
        if (!projetoDTO.getTarefa4().isEmpty()){
            tarefa.add(projetoDTO.getTarefa4());
        }
        if (!projetoDTO.getTarefa5().isEmpty()){
            tarefa.add(projetoDTO.getTarefa5());
        }
        projeto.setTarefa(tarefa);

        List<String> anexo = new ArrayList<>();
        if (!projetoDTO.getAnexo1().isEmpty()){
            anexo.add(projetoDTO.getAnexo1());
        }
        if (!projetoDTO.getAnexo2().isEmpty()){
            anexo.add(projetoDTO.getAnexo2());
        }
        if (!projetoDTO.getAnexo3().isEmpty()){
            anexo.add(projetoDTO.getAnexo3());
        }
        if (!projetoDTO.getAnexo4().isEmpty()){
            anexo.add(projetoDTO.getAnexo4());
        }
        if (!projetoDTO.getAnexo5().isEmpty()){
            anexo.add(projetoDTO.getAnexo5());
        }
        projeto.setAnexo(anexo);

        List<String> equipe = new ArrayList<>();
        if (!projetoDTO.getEquipe1().isEmpty()){
            equipe.add(projetoDTO.getEquipe1());
        }
        if (!projetoDTO.getEquipe2().isEmpty()){
            equipe.add(projetoDTO.getEquipe2());
        }
        if (!projetoDTO.getEquipe3().isEmpty()){
            equipe.add(projetoDTO.getEquipe3());
        }
        if (!projetoDTO.getEquipe4().isEmpty()){
            equipe.add(projetoDTO.getEquipe4());
        }
        if (!projetoDTO.getEquipe5().isEmpty()){
            equipe.add(projetoDTO.getEquipe5());
        }
        projeto.setEquipe(equipe);

        List<String> orcamentoGeral = new ArrayList<>();
        if (!projetoDTO.getOrcamentoGeral1().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral1());
        }
        if (!projetoDTO.getOrcamentoGeral2().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral2());
        }
        if (!projetoDTO.getOrcamentoGeral3().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral3());
        }
        if (!projetoDTO.getOrcamentoGeral4().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral4());
        }
        if (!projetoDTO.getOrcamentoGeral5().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral5());
        }
        projeto.setOrcamentoGeral(orcamentoGeral);

        List<String> orcamentoSimulacaoGeral = new ArrayList<>();
        if (!projetoDTO.getOrcamentoSimulacaoGeral1().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral1());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGeral2().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral2());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGeral3().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral3());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGeral4().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral4());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGeral5().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral5());
        }
        projeto.setOrcamentoSimulacaoGeral(orcamentoSimulacaoGeral);

    }

}
