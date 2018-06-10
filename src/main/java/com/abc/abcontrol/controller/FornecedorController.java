package com.abc.abcontrol.controller;

import com.abc.abcontrol.model.Fornecedor;
import com.abc.abcontrol.repository.FornecedorRepository;
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
public class FornecedorController {

    @Autowired
    FornecedorRepository fornecedorRepository;

    @RequestMapping(value="/cadastrarFornecedor", method=RequestMethod.GET)
    public String formCadastrarFornecedor_carregar() {
        return "fornecedor/cadastrarFornecedor";
    }

    @RequestMapping(value="/cadastrarFornecedor", method=RequestMethod.POST)
    public String formCadastrarFornecedor_cadastrar(Fornecedor fornecedor) {
        fornecedorRepository.save(fornecedor);
        return "redirect:/todosFornecedores";
    }

    @RequestMapping(value="/todosFornecedores", method=RequestMethod.GET)
    public ModelAndView mostraTodosFornecedores(){
        ModelAndView mv = new ModelAndView("fornecedor/consultarFornecedores");
        Collection<Fornecedor> fornecedores = fornecedorRepository.findAll();
        mv.addObject("fornecedores", fornecedores);
        return mv;
    }
}