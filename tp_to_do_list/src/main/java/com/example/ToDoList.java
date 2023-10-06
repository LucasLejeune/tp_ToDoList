package com.example;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Event> eventList = new ArrayList<Event>();

    public ToDoList() {
    }

    public Event getEvent(int index) {
        return eventList.get(index);
    }

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void showEvents() {
        for (Event event : eventList) {
            System.out.println(event.toString());
        }
    }

    public void deleteEvent(int index) {
        eventList.remove(index);
    }

    public void exit() {
        System.exit(0);
    }

}
