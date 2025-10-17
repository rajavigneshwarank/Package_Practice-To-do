package com.rajavigneswaran.todo.util;

public class IdGen {

    private static int next = 1;

    public static int nextId()
    {
        return next++;
    }
}
