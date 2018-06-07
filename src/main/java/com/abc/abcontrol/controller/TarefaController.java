package com.abc.abcontrol.controller;

import com.abc.abcontrol.model.Tarefa;
import com.abc.abcontrol.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

//Create, Read, Update e Delete
@Controller
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepository;

    //Retorna formulario para o Create (é GET pois está retornando o formulário)
    @RequestMapping(value="/cadastrarTarefa", method=RequestMethod.GET)
    public String formCadastrarTarefa_carregar() {

        //retorna a view formCadastrarTarefa.xml que criamos
        return "tarefa/cadastrarTarefa";
    }

    //Create
    //é POST pois está cadastrando as infs do formulário
    @RequestMapping(value="/cadastrarTarefa", method=RequestMethod.POST)
    public String formCadastrarTarefa_cadastrar(Tarefa tarefa) {

        tarefaRepository.save(tarefa);

        //redireciona para a mesma página
        return "redirect:/todasTarefas";
    }

    //Read
    @RequestMapping(value="/todasTarefas", method=RequestMethod.GET)
    public ModelAndView mostraTodasTarefas(){
        ModelAndView mv = new ModelAndView("index");
        Collection<Tarefa> tarefas = tarefaRepository.findAll();
        mv.addObject("tarefas", tarefas);
        return mv;
    }


}