package com.fag.listatarefasdozucco.service;

import com.fag.listatarefasdozucco.model.Lista;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ListaService {
    private List<Lista> tarefas = new ArrayList<>();

    public List<Lista> getAllTarefas(){
        System.out.println("Número de tarefas: " + tarefas.size());
        return tarefas;
    }

    public void addTarefa(Lista novaTarefa){
        tarefas.add(novaTarefa);
    }

    public void marcaCompletado(Long id) {
        for (Lista lista : tarefas){
            if (lista.getId(id).equals(id)){
                lista.setCompletado(true);
            }
        }
    }

    public void deleteTarefa(Long id){
        tarefas.removeIf(tarefa -> tarefa.getId(id).equals(id));
    }
}
