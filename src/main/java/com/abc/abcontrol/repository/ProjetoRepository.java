package com.abc.abcontrol.repository;

import com.abc.abcontrol.model.Projeto;
import com.abc.abcontrol.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SavannaDenega
 */
@Repository
public class ProjetoRepository{

    private static Map<Integer, Projeto> projetos;

    static {

        projetos = new HashMap<Integer, Projeto>(){

            {
                put(1, new Projeto(1, "Projeto Casa Moderna", "Casa", "Em execução", "01/01/18", "01/12/18"));
                put(2, new Projeto(2, "Projeto Prédio La Vive", "Prédio", "Em projeto", "02/02/18", "10/12/18"));
                put(3, new Projeto(3, "Projeto Reforma Restaurante 15", "Reforma", "Em projeto", "01/01/17", "20/08/18"));
            }
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
