/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.listatarefasdozucco.model;

/**
 *
 * @author Z u c c o
 */
public class Lista {
    private Long id;
    private String tarefa;
    private boolean completado;

    public Lista(String tarefa, boolean completado){
        this.tarefa = tarefa;
        this.completado = completado;
    }

    public long getId(){
        return id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getTarefa(){
        return tarefa;
    }

    public void setTaretfa(String tarefa){
        this.tarefa = tarefa;
    }

    public boolean taCompletado(){
        return completado;
    }

    public void setCompletado(boolean completado){
        this.completado = completado;
    }
}
