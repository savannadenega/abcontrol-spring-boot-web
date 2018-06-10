package com.abc.abcontrol.repository;

import com.abc.abcontrol.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SavannaDenega
 */
@Repository
public class TarefaRepository{

    private static Map<Integer, Tarefa> tarefas;

    static {

        tarefas = new HashMap<Integer, Tarefa>(){

            {
                put(1, new Tarefa(1, "Gerar relatório projetos", "Gerar relatório de todos os projetos em execução neste mês."));
                put(2, new Tarefa(2, "Criar Projeto Cliente 012", "Criar Projeto para Cliente 012 sobre casa na praia."));
                put(3, new Tarefa(3, "Solicitar orçamento cimento", "Solicitar orçamento de cimento para todas as empresas na lista de fornecedores."));
            }
        };
    }

    public Collection<Tarefa> findAll(){
        return this.tarefas.values();
    }

    public Tarefa getTarefaById(int id){
        return this.tarefas.get(id);
    }

    public void removeTarefaById(int id) {
        this.tarefas.remove(id);
    }

    public void updateTarefa(Tarefa tarefa) {
        this.tarefas.put(tarefa.getId(), tarefa);
    }

    public void save(Tarefa tarefa) {
        this.tarefas.put(tarefa.getId(), tarefa);
    }

}