package com.fag.listadetarefasdozucco.service;

import com.fag.listadetarefasdozucco.model.Lista;
import com.fag.listadetarefasdozucco.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ListaService {
    @Autowired
    private TarefaRepository tarefaRepository;
    public String addTarefa(Lista novaTarefa) {
        tarefaRepository.save(novaTarefa);
        return null;
    }

}
