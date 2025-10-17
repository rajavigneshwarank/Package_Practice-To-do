package com.rajavigneswaran.todo.model;

public class ToDoItem {

    private final int id;
    private String title;
    boolean done; // package-private on purpose


    public ToDoItem(int id, String title)
    {
        this.id = id;
        this.title = title;
        this.done = false;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isDone()
    {
        return done;
    }

    public void setDone(boolean done)
    {
        this.done = done;
    }


    @Override
    public String toString()
    {
        return "[" + id + "] " + title + (done ? " (done)" : "");
    }
}
