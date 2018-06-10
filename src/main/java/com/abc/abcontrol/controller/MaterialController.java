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
public class MaterialController {

    @Autowired
    MaterialRepository materialRepository;

    @RequestMapping(value="/cadastrarMaterial", method=RequestMethod.GET)
    public String formCadastrarMaterial_carregar() {
        return "material/cadastrarMaterial";
    }

    @RequestMapping(value="/cadastrarMaterial", method=RequestMethod.POST)
    public String formCadastrarMaterial_cadastrar(Material material) {
        materialRepository.save(material);
        return "redirect:/todosMateriais";
    }

    @RequestMapping(value="/todosMateriais", method=RequestMethod.GET)
    public ModelAndView mostraTodosMateriais(){
        ModelAndView mv = new ModelAndView("material/consultarMateriais");
        Collection<Material> materiais = materialRepository.findAll();
        mv.addObject("materiais", materiais);
        return mv;
    }
}