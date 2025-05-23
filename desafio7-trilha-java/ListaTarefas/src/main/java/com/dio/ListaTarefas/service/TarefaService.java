package com.dio.ListaTarefas.service;

import com.dio.ListaTarefas.model.Tarefa;

import java.util.List;

public interface TarefaService {
    Tarefa criarTarefa(Tarefa tarefa);
    List<Tarefa> listarTarefas();
    Tarefa buscarPorId(Long id);
    void deletarPorId(Long id);
}
