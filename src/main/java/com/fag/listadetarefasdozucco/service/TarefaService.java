package com.fag.listadetarefasdozucco.service;

import com.fag.listadetarefasdozucco.model.Tarefa;
import com.fag.listadetarefasdozucco.repository.RepositorioTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

// Serviço responsável por lógica de negócios relacionada a Tarefa
@Service
public class TarefaService {

    // Injeção de dependência do RepositorioTarefa
    @Autowired
    private RepositorioTarefa repositorioTarefa;

    // Salva uma nova tarefa e retorna a resposta HTTP
    public ResponseEntity<?> salvar(Tarefa novaTarefa) {
        return new ResponseEntity<Tarefa>(repositorioTarefa.save(novaTarefa), HttpStatus.OK);
    }

    // Encontra uma tarefa por ID e retorna a resposta HTTP
    public ResponseEntity<?> encontrarTarefaPorId(Long idTarefa) {
        Tarefa tarefa = repositorioTarefa.findById(idTarefa).orElse(null);

        if (tarefa != null) {
            return ResponseEntity.ok(tarefa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Exclui uma tarefa por ID
    public void excluirTarefaPorId(Long idTarefa) {
        repositorioTarefa.deleteById(idTarefa);
    }

    // Retorna todas as tarefas
    public Iterable<Tarefa> encontrarTodasTarefas() {
        return repositorioTarefa.findAll();
    }
}
