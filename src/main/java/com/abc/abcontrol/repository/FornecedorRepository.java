package com.abc.abcontrol.repository;

import com.abc.abcontrol.model.Fornecedor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cássio Linden
 */

@Repository
public class FornecedorRepository{

    private static final Map<Integer, Fornecedor> fornecedores;

    static {

        fornecedores = new HashMap<Integer, Fornecedor>(){

            {
                put(1, new Fornecedor(1, "Juca Materiais LTDA", "Juca Materiais", "07.590.233/0001-30", "2000-05-15", "Júlio de Castilhos, 1234, Porto Alegre - RS", "51 3231-1941", "", "juca@email.com"));
            }
        };
    }

    public Collection<Fornecedor> findAll(){
        return FornecedorRepository.fornecedores.values();
    }

    public static Fornecedor getFornecedorById(int id){
        return FornecedorRepository.fornecedores.get(id);
    }

    public void removeFornecedorById(int id) {
        this.fornecedores.remove(id);
    }

    public void updateFornecedor(Fornecedor fornecedor) {
        this.fornecedores.put(fornecedor.getId(), fornecedor);
    }

    public void save(Fornecedor fornecedor) {
        this.fornecedores.put(fornecedor.getId(), fornecedor);
    }

}
