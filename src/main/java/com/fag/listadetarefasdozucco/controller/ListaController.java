package com.fag.listadetarefasdozucco.controller;

import com.fag.listadetarefasdozucco.model.Lista;
import com.fag.listadetarefasdozucco.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListaController{

    @Autowired
    private ListaService listaService;

    @GetMapping("/")
    public String rota(){
        return "Api de Produtos funcionado!";
    }
    @PostMapping("/add")
    public String addTarefa(Lista novaTarefa){
        listaService.addTarefa(novaTarefa);
        System.out.println("Tarefa adicionada: " + novaTarefa.getTarefa());
        return "Tarefa adicionada com sucesso!!";
    }
}