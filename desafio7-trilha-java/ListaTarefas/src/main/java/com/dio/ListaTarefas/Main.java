package com.dio.ListaTarefas;

import com.dio.ListaTarefas.service.TarefaService;
import com.dio.ListaTarefas.service.TarefaServiceImpl;
import com.dio.ListaTarefas.model.Tarefa;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarefaService tarefaService = new TarefaServiceImpl();

        Tarefa novaTarefa = new Tarefa(null, "Estudar padrões de projeto", false, LocalDateTime.now());
        Tarefa tarefaCriada = tarefaService.criarTarefa(novaTarefa);
        System.out.println("Tarefa criada: " + tarefaCriada);

        List<Tarefa> tarefas = tarefaService.listarTarefas();
        System.out.println("\nTarefas cadastradas:");
        tarefas.forEach(System.out::println);

        Long idBusca = tarefaCriada.getId();
        Tarefa tarefaEncontrada = tarefaService.buscarPorId(idBusca);
        System.out.println("\nTarefa encontrada por ID: " + tarefaEncontrada);

        tarefaService.deletarPorId(idBusca);
        System.out.println("\nTarefa deletada com sucesso!");

        System.out.println("\nTarefas após exclusão:");
        tarefaService.listarTarefas().forEach(System.out::println);
    }
}
