package com.fag.listatarefasdozucco.service;

import com.fag.listatarefasdozucco.service.Tarefas;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ListaService {
    private List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> getAllTarefas(){
        return tarefas;
    }

    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void marcaCompletado(Long id) {
        for (Tarefa tarefa : tarefas){
            if (tarefa.getID().equals(id)){
                tarefa.setCompletado(true);
            }
        }
    }

    public void deleteTarefa(Long id){
        tarefas.removeIF(tarefa -> tarefa.getID().equals(id))
    }
}
