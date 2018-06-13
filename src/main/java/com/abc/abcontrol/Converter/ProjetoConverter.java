package com.abc.abcontrol.Converter;

import com.abc.abcontrol.DTO.ProjetoDTO;
import com.abc.abcontrol.model.Projeto;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

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
        if (!projetoDTO.getObra1().isEmpty()){
            obra.add(projetoDTO.getObra1());
        }
        if (!projetoDTO.getObra1().isEmpty()){
            obra.add(projetoDTO.getObra2());
        }
        if (!projetoDTO.getObra1().isEmpty()){
            obra.add(projetoDTO.getObra3());
        }
        if (!projetoDTO.getObra1().isEmpty()){
            obra.add(projetoDTO.getObra4());
        }
        if (!projetoDTO.getObra1().isEmpty()){
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
        if (!projetoDTO.getOrcamentoGeral().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGeral());
        }
        if (!projetoDTO.getOrcamentoGera2().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGera2());
        }
        if (!projetoDTO.getOrcamentoGera3().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGera3());
        }
        if (!projetoDTO.getOrcamentoGera4().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGera4());
        }
        if (!projetoDTO.getOrcamentoGera5().isEmpty()){
            orcamentoGeral.add(projetoDTO.getOrcamentoGera5());
        }
        projeto.setOrcamentoGeral(orcamentoGeral);

        List<String> orcamentoSimulacaoGeral = new ArrayList<>();
        if (!projetoDTO.getOrcamentoSimulacaoGeral().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGeral());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGera2().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGera2());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGera3().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGera3());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGera4().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGera4());
        }
        if (!projetoDTO.getOrcamentoSimulacaoGera5().isEmpty()){
            orcamentoSimulacaoGeral.add(projetoDTO.getOrcamentoSimulacaoGera5());
        }
        projeto.setOrcamentoSimulacaoGeral(orcamentoSimulacaoGeral);

    }

}
