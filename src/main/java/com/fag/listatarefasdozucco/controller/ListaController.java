package com.fag.listatarefasdozucco.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import com.fag.listatarefasdozucco.service.ListaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListaController {

    @Autowired
    private ListaService listaService;

    @GetMapping("/")
    public String index(Model model) {
        model.AddAtributo("tarefas", listaService.getAllTarefas());
        return "index";
    }

    @PostMapping("/add")
    public String addTarefas(Tarefa tarefa){
        listaService.addTarefa(tarefa);
        return "redirect:/";
    }
    
}
