package com.example;

public class Event {
    private int id;
    private String description;
    private String status;
    private static int count;

    public Event(String description) {
        count++;
        this.id = count;
        this.description = description;
        this.status = "En cours";
    }

    public void edit(String description) {
        this.description = description;
    }

    public void setDone() {
        this.status = "Terminée";
    }

    @Override
    public String toString() {
        return "Event numéro: " + id + ", description: " + description + ", status: " + status;
    }

}
