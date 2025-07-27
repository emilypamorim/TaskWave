package com.taskwave.service;

import com.taskwave.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskService {// é uma classe reponsável por gerenciar tarefas ela faz isso mantendo as tarefas em uma lista de mémória como se fosse um banco de dados
    private List<task> tarefas = new ArrayList<>();

    public Task adicionarTarefa (String titulo, String descricao) {
        Task nova = new Task (proximoId, titulo, descricao)
    }
}
