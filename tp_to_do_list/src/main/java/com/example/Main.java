package com.example;

public class Main {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        newEventInTodo("Faire les courses", todo);
        newEventInTodo("Modifier la classe \"Article\"", todo);
        newEventInTodo("Refaire la méthode \"edit\" de la classe \"Article\"", todo);
        todo.showEvents();
        todo.getEvent(1).setDone();
        todo.deleteEvent(0);
        System.out.println("------------------------------");
        todo.showEvents();
        // todo.exit();
    }

    static public void newEventInTodo(String description, ToDoList todo) {
        Event ev = new Event(description);
        todo.addEvent(ev);
    }
}