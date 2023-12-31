package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Scanner myObj = new Scanner(System.in);
        Boolean continuer = true;
        int choix;
        int index;
        while (continuer) {
            System.out.println(
                    "\n\nChoisir une action:\n1. Ajouter une tâche\n2. Afficher les tâches\n3. Marquer une tâche comme terminée\n4. Supprimer une tâche\n5. Modifier un évènement\n6. Quitter");
            choix = myObj.nextInt();
            myObj.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter une description:");
                    String desc = myObj.nextLine();
                    newEventInTodo(desc, todo);
                    break;
                case 2:
                    todo.showEvents();
                    break;
                case 3:
                    System.out.println("Quelle évènement changer ?");
                    todo.showEvents();
                    index = myObj.nextInt();
                    myObj.nextLine();
                    todo.getEvent(index - 1).setDone();
                    break;
                case 4:
                    System.out.println("Quel évènement supprimer ?");
                    todo.showEvents();
                    int choixDel = myObj.nextInt();
                    myObj.nextLine();
                    todo.deleteEvent(choixDel - 1);
                    break;

                case 5:
                    System.out.println("Quel évènement modifier ?");
                    todo.showEvents();
                    int choixEdit = myObj.nextInt();
                    myObj.nextLine();
                    System.out.println("Ecrire la nouvelle description:");
                    String newDesc = myObj.nextLine();
                    todo.getEvent(choixEdit - 1).edit(newDesc);
                    break;
                case 6:
                    continuer = false;
                    todo.exit();
                    break;

                default:
                    System.out.println("Commande invalide, ressayer");
                    break;
            }
        }

    }

    static public void newEventInTodo(String description, ToDoList todo) {
        Event ev = new Event(description);
        todo.addEvent(ev);
    }
}