package com.fag.listadetarefasdozucco.controller;

import com.fag.listadetarefasdozucco.model.Tarefa;
import com.fag.listadetarefasdozucco.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ControladorTarefa {

    @Autowired
    private TarefaService servicoTarefa;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody Tarefa novaTarefa) {
        return servicoTarefa.salvar(novaTarefa);
    }

    @PutMapping("/alterar/{idTarefa}")
    public ResponseEntity<?> alterar(@PathVariable Long idTarefa, @RequestBody Tarefa tarefaAtualizada) {
        if (!idTarefa.equals(tarefaAtualizada.getId())) {
            return ResponseEntity.badRequest().body("ID da tarefa na URL não corresponde ao ID da tarefa no corpo da requisição.");
        }
        return servicoTarefa.salvar(tarefaAtualizada);
    }

    @GetMapping("/encontrar/{idTarefa}")
    public ResponseEntity<?> encontrarTarefaPorId(@PathVariable Long idTarefa) {
        return servicoTarefa.encontrarTarefaPorId(idTarefa);
    }

    @GetMapping("/encontrarTodas")
    public Iterable<Tarefa> encontrarTodas() {
        return servicoTarefa.encontrarTodasTarefas();
    }

    @DeleteMapping("/excluir/{idTarefa}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirTarefa(@PathVariable Long idTarefa) {
        servicoTarefa.excluirTarefaPorId(idTarefa);
    }
}
