package com.dio.ListaTarefas.service;

import com.dio.ListaTarefas.model.Tarefa;
import com.dio.ListaTarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    private TarefaRepository repository;

    @Override
    public Tarefa criarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    @Override
    public Tarefa buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com ID: " + id));
    }

    @Override
    public void deletarPorId(Long id) {
        repository.deleteById(id);
    }
}
