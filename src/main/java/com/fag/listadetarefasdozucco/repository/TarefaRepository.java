package com.fag.listadetarefasdozucco.repository;

import com.fag.listadetarefasdozucco.model.Lista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends CrudRepository<Lista,Long>{

}
