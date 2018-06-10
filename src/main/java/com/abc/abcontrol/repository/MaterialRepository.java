package com.abc.abcontrol.repository;

import com.abc.abcontrol.model.Material;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cássio Linden
 */

@Repository
public class MaterialRepository{

    private static Map<Integer, Material> materiais;
    

    static{
        materiais = new HashMap<Integer, Material>(){
            {
                put(1, new Material(1, FornecedorRepository.getFornecedorById(1), "", "", "", 0.00));
//                Material(int id, Fornecedor fornecedor, String tipoMaterial, String descricao, String tipoUnidade, double valorUnidade)
            }
        };
    }

    public Collection<Material> findAll(){
        return this.materiais.values();
    }

    public Material getMaterialById(int id){
        return this.materiais.get(id);
    }

    public void removeMaterialById(int id) {
        this.materiais.remove(id);
    }

    public void updateMaterial(Material material) {
        this.materiais.put(material.getId(), material);
    }

    public void save(Material material) {
        this.materiais.put(material.getId(), material);
    }

}
