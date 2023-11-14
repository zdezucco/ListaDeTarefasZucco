package com.fag.listadetarefasdozucco.service;

import com.fag.listadetarefasdozucco.model.Tarefa;
import com.fag.listadetarefasdozucco.repository.RepositorioTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    private RepositorioTarefa repositorioTarefa;

    public ResponseEntity<?> salvar(Tarefa novaTarefa) {
        return new ResponseEntity<Tarefa>(repositorioTarefa.save(novaTarefa), HttpStatus.OK);
    }

    public ResponseEntity<?> encontrarTarefaPorId(Long idTarefa) {
        Tarefa tarefa = repositorioTarefa.findById(idTarefa).orElse(null);

        if (tarefa != null) {
            return ResponseEntity.ok(tarefa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public void excluirTarefaPorId(Long idTarefa) {
        repositorioTarefa.deleteById(idTarefa);
    }

    public Iterable<Tarefa> encontrarTodasTarefas() {
        return repositorioTarefa.findAll();
    }
}
