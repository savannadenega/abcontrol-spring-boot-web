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
                put(1, new Material(1, "Juca Materiais LTDA", "", "", "", 0.00));
            }
        };
    }

    public Collection<Material> findAll(){
        return this.materiais.values();
    }

    public void save(Material material) {
        this.materiais.put(material.getId(), material);
    }

    public void update(Material material) {
        this.materiais.put(material.getId(), material);
    }

    public void delete(int id) {
        this.materiais.remove(id);
    }

    public Material findMaterialById(int id){
        return this.materiais.get(id);
    }

}
