package com.abc.abcontrol.repository;

import com.abc.abcontrol.model.Projeto;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author SavannaDenega
 */
@Repository
public class ProjetoRepository{

    private static Map<Integer, Projeto> projetos;

    static {

        projetos = new HashMap<Integer, Projeto>(){
            {
                List<String> obra = new ArrayList<>();
                obra.add("Obra 1");
                List<String> tarefa = new ArrayList<>();
                tarefa.add("Tarefa 1");
                List<String> anexo = new ArrayList<>();
                anexo.add("Projeto Arquitetônico");
                List<String> equipe = new ArrayList<>();
                equipe.add("A");
                List<String> orcamentoGeral = new ArrayList<>();
                orcamentoGeral.add("20000");
                List<String> orcamentoSimulacaoGeral = new ArrayList<>();
                orcamentoSimulacaoGeral.add("17000");

                put(1, new Projeto(1, "Projeto Casa Moderna", "Casa", "Em execução",
                    "01/01/18", "01/12/18", obra, tarefa, anexo, equipe,
                    orcamentoGeral, orcamentoSimulacaoGeral));
                put(2, new Projeto(2, "Projeto Casa Moderna Grande", "Casa", "Em execução",
                        "01/01/18", "01/12/18", obra, tarefa, anexo, equipe,
                        orcamentoGeral, orcamentoSimulacaoGeral));
            };
        };
    }

    public Collection<Projeto> findAll(){
        return this.projetos.values();
    }

    public void save(Projeto projeto) {
        this.projetos.put(projeto.getId(), projeto);
    }

    public void update(Projeto projeto) {
        this.projetos.put(projeto.getId(), projeto);
    }

    public void delete(int id) {
        this.projetos.remove(id);
    }

    public Projeto findProjetoById(int id){
        return this.projetos.get(id);
    }

}
