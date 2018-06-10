package com.abc.abcontrol.controller;

import com.abc.abcontrol.model.Projeto;
import com.abc.abcontrol.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

//Create, Read, Update e Delete
@Controller
@RequestMapping(value="/projeto")
public class ProjetoController{

    @Autowired
    ProjetoRepository projetoRepository;

    //Retorna formulario para o Create (é GET pois está retornando o formulário)
    @RequestMapping(value="/cadastrarProjeto", method=RequestMethod.GET)
    public String formCadastrarProjeto_carregar() {

        //retorna a view formCadastrarTarefa.xml que criamos
        return "/projeto/cadastrarProjeto";
    }

    //Create
    //é POST pois está cadastrando as infs do formulário
    @RequestMapping(value="/cadastrarProjeto", method=RequestMethod.POST)
    public String formCadastrarProjeto_cadastrar(Projeto projeto) {

        projetoRepository.save(projeto);

        //redireciona para a mesma página
        return "redirect:/projeto/todosProjetos";
    }

    //Read
    @RequestMapping(value="/todosProjetos", method=RequestMethod.GET)
    public ModelAndView mostraTodosProjetos(){
        ModelAndView mv = new ModelAndView("projeto/todosProjetos.html");
        Collection<Projeto> projetos = projetoRepository.findAll();
        mv.addObject("projetos", projetos);
        return mv;
    }

    @RequestMapping("/deletarProjeto")
    public String deletarProjeto(int id){

        Projeto projeto = projetoRepository.findProjetoById(id);
        projetoRepository.delete(projeto.getId());

        return "redirect:/projeto/todosProjetos";
    }

    //Update
    @RequestMapping("/editarProjeto")
    public ModelAndView editarProjeto_carregar(int id){
        ModelAndView mv = new ModelAndView("projeto/editarProjeto.html");
        Projeto projeto = projetoRepository.findProjetoById(id);
        mv.addObject("projeto", projeto);
        return mv;
    }

    //Update
    @RequestMapping(value="/editarProjeto", method=RequestMethod.POST)
    public String editarProjeto_cadastrar(Projeto projeto) {

        projetoRepository.update(projeto);

        //redireciona para a mesma página
        return "redirect:/projeto/todosProjetos";
    }

}
