package com.fag.listatarefasdozucco.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;
import java.util.List;

public class ListaService {
    private List<Tarefa> tarefas;

    public List<Tarefa> getAllTarefas(){
        return tarefas;
    }

    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }
}
