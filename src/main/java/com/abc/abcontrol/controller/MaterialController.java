package com.abc.abcontrol.controller;

import com.abc.abcontrol.model.Material;
import com.abc.abcontrol.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 *
 * @author Cássio Linden
 */

@Controller
@RequestMapping(value="/material")
public class MaterialController{

    @Autowired
    MaterialRepository materialRepository;

    //Retorna formulario para o Create (é GET pois está retornando o formulário)
    @RequestMapping(value="/cadastrarMaterial", method=RequestMethod.GET)
    public String formCadastrarMaterial_carregar() {

        //retorna a view formCadastrarTarefa.xml que criamos
        return "/material/cadastrarMaterial";
    }

    //Create
    //é POST pois está cadastrando as infs do formulário
    @RequestMapping(value="/cadastrarMaterial", method=RequestMethod.POST)
    public String formCadastrarMaterial_cadastrar(Material material) {
        materialRepository.save(material);
        //redireciona para a mesma página
        return "redirect:/material/todosMateriais"; //aqui vai para as tarefas
    }

    //Read
    @RequestMapping(value="/todosMateriais", method=RequestMethod.GET)
    public ModelAndView mostraTodosMateriais(){
        ModelAndView mv = new ModelAndView("material/todosMateriais.html");
        Collection<Material> materiais = materialRepository.findAll();
        mv.addObject("materiais", materiais);
        return mv;
    }

    @RequestMapping("/deletarMaterial")
    public String deletarMaterial(int id){

        Material material = materialRepository.findMaterialById(id);
        materialRepository.delete(material.getId());

        return "redirect:/material/todosMateriais";
    }

    //Update
    @RequestMapping("/editarMaterial")
    public ModelAndView editarMaterial_carregar(int id){
        ModelAndView mv = new ModelAndView("material/editarMaterial.html");
        Material material = materialRepository.findMaterialById(id);
        mv.addObject("material", material);
        return mv;
    }

    //Update
    @RequestMapping(value="/editarMaterial", method=RequestMethod.POST)
    public String editarMaterial_cadastrar(Material material) {

        materialRepository.update(material);

        //redireciona para a mesma página
        return "redirect:/material/todosMateriais";
    }

}
