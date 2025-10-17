package com.rajavigneswaran.todo.repo;
import com.rajavigneswaran.todo.model.ToDoItem;

import java.util.*;

public class TodoRepository {

    private final Map<Integer, ToDoItem> store = new HashMap<>();

    public void save(ToDoItem item)
    {
        store.put(item.getId(), item);
    }

    public ToDoItem findById(int id)
    {
        return store.get(id);
    }

    public List<ToDoItem> findAll()
    {
        return new ArrayList<>(store.values());
    }

    public boolean delete(int id)
    {
        return store.remove(id) != null;
    }
}
