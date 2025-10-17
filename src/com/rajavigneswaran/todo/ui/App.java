package com.rajavigneswaran.todo.ui;

import com.rajavigneswaran.todo.repo.TodoRepository;
import com.rajavigneswaran.todo.service.TodoService;
import com.rajavigneswaran.todo.model.ToDoItem;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        TodoRepository repo = new TodoRepository();

        TodoService service = new TodoService(repo);

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1-add 2-list 3-complete 4-remove 5-exit");

            String cmd = sc.nextLine().trim();



            if (cmd.equals("1")) {
                System.out.print("Enter the task name: ");
                String title = sc.nextLine();

                ToDoItem t = service.create(title);
                System.out.println("added " + t);
            }

            else if (cmd.equals("2"))
            {
                for (ToDoItem t : service.list()) System.out.println(t);
            }

            else if (cmd.equals("3"))
            {
                System.out.print("id: ");

                int id = Integer.parseInt(sc.nextLine());

                System.out.println(service.complete(id) ? "completed" : "not found");
            }
            else if (cmd.equals("4")) {
                System.out.print("Enter the task id to remove: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println(service.remove(id) ? "removed" : "not found");
            }

            else if(cmd.equals("5")){
                exit = true;
            }

        }


    }
}
