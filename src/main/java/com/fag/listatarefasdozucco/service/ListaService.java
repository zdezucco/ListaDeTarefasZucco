package com.fag.listatarefasdozucco.service;

<<<<<<< HEAD
import com.fag.listatarefasdozucco.model.Lista;
=======
import com.fag.listatarefasdozucco.service.Tarefas;
>>>>>>> 7069dea502c4220d2a8cf774d8ff9d97674a7aa4
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ListaService {
<<<<<<< HEAD
    private List<Lista> tarefas = new ArrayList<>();
=======
    private List<Tarefa> tarefas = new ArrayList<>();
>>>>>>> 7069dea502c4220d2a8cf774d8ff9d97674a7aa4

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
