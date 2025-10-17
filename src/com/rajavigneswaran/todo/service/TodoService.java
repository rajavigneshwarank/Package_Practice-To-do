package com.rajavigneswaran.todo.service;

import com.rajavigneswaran.todo.model.ToDoItem;
import com.rajavigneswaran.todo.repo.TodoRepository;
import com.rajavigneswaran.todo.util.IdGen;
import java.util.List;

public class TodoService {
    private final TodoRepository repo;

    public TodoService(TodoRepository repo)
    {
        this.repo = repo;
    }

    public ToDoItem create(String title) {
        ToDoItem item = new ToDoItem(IdGen.nextId(), title);
        repo.save(item);
        return item;
    }

    public List<ToDoItem> list() { return repo.findAll(); }

    public boolean complete(int id) {
        ToDoItem t = repo.findById(id);
        if (t == null) return false;
        t.setDone(true);
        repo.save(t);
        return true;
    }

    public boolean remove(int id)
    {
        return repo.delete(id);
    }
}