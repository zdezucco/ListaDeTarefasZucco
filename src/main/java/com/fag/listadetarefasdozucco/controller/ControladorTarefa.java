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

    // Injeção de dependência do serviço TarefaService
    @Autowired
    private TarefaService servicoTarefa;

    // Salva uma nova tarefa via requisição POST
    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody Tarefa novaTarefa) {
        // Chama o serviço para salvar a nova tarefa e retorna a resposta do serviço
        return servicoTarefa.salvar(novaTarefa);
    }

    // Altera uma tarefa existente via requisição PUT
    @PutMapping("/alterar/{idTarefa}")
    public ResponseEntity<?> alterar(@PathVariable Long idTarefa, @RequestBody Tarefa tarefaAtualizada) {
        // Verifica se o ID na URL corresponde ao ID no corpo da requisição
        if (!idTarefa.equals(tarefaAtualizada.getId())) {
            // Retorna uma resposta de erro se os IDs não correspondem
            return ResponseEntity.badRequest().body("ID da tarefa na URL não corresponde ao ID da tarefa no corpo da requisição.");
        }
        // Chama o serviço para salvar a tarefa atualizada e retorna a resposta do serviço
        return servicoTarefa.salvar(tarefaAtualizada);
    }

    // Encontra uma tarefa por ID via requisição GET
    @GetMapping("/encontrar/{idTarefa}")
    public ResponseEntity<?> encontrarTarefaPorId(@PathVariable Long idTarefa) {
        // Chama o serviço para encontrar a tarefa por ID e retorna a resposta do serviço
        return servicoTarefa.encontrarTarefaPorId(idTarefa);
    }

    // Encontra todas as tarefas via requisição GET
    @GetMapping("/encontrarTodas")
    public Iterable<Tarefa> encontrarTodas() {
        // Chama o serviço para encontrar todas as tarefas e retorna a coleção de tarefas
        return servicoTarefa.encontrarTodasTarefas();
    }

    // Exclui uma tarefa por ID via requisição DELETE
    @DeleteMapping("/excluir/{idTarefa}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirTarefa(@PathVariable Long idTarefa) {
        // Chama o serviço para excluir a tarefa por ID
        servicoTarefa.excluirTarefaPorId(idTarefa);
    }
}
