package com.fag.listatarefasdozucco.controller;

<<<<<<< HEAD
import com.fag.listatarefasdozucco.model.Lista;
import com.fag.listatarefasdozucco.service.ListaService;

import java.util.List;

=======
import com.fag.listatarefasdozucco.Model.Lista;
import com.fag.listatarefasdozucco.service.ListaService;
>>>>>>> 7069dea502c4220d2a8cf774d8ff9d97674a7aa4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListaController {

    @Autowired
    private ListaService listaService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tarefas", listaService.getAllTarefas());
        List<Lista> tarefas = listaService.getAllTarefas();
        System.out.println("Número de tarefas: " + tarefas.size());
        model.addAttribute("tarefas", tarefas);
        return "index";
    }

    @PostMapping("/add")
    public String addTarefa(Lista novaTarefa){
        listaService.addTarefa(novaTarefa);
        System.out.println("Tarefa adicionada: " + novaTarefa.getTarefa());
        return "redirect:/";
    }
    
    @GetMapping("/complete/{id}")
    public String tarefaCompletada(@PathVariable Long id) {
        listaService.marcaCompletado(id);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTarefa(@PathVariable Long id) {
<<<<<<< HEAD
        listaService.deleteTarefa(id);
        return "redirect:/";
    }
=======
        listaService.removeTarefa(id);
        return "redirect:/";
>>>>>>> 7069dea502c4220d2a8cf774d8ff9d97674a7aa4
}
