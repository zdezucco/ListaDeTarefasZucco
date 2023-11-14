package com.fag.listadetarefasdozucco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.fag.listadetarefasdozucco")
public class ListadetarefasApp {

    public static void main(String[] args) {
        SpringApplication.run(ListadetarefasApp.class, args);
    }

}
