package com.fag.listadetarefasdozucco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// Entidade JPA que mapeia a tabela "Tarefa" no banco de dados
@Entity
@Table(name = "Tarefa")
@Getter
@Setter
public class Tarefa {

    // Identificador único gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Descrição da tarefa
    private String descricao;

    // Indica se a tarefa está concluída ou não
    private boolean concluida;
}
