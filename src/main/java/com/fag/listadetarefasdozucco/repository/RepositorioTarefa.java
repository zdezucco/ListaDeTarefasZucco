package com.fag.listadetarefasdozucco.repository;

import com.fag.listadetarefasdozucco.model.Tarefa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTarefa extends CrudRepository<Tarefa, Long>{

}
