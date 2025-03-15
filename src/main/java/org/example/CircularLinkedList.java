package org.example;

public class CircularLinkedList {
    private Player head = null;
    private Player tail = null;

    public CircularLinkedList(Player... players) {
        for(Player player : players){
            addPlayer(player);
        }
    }

    public void addPlayer(Player newPlayer){
        if(head == null){
            head = newPlayer;
            tail = newPlayer;
            tail.next = head;
        }else {
            tail.next = newPlayer;
            tail = newPlayer;
            tail.next = head; //Circular connection.
        }
    }

    public void displayPlayers() {
        if (head == null) {
            System.out.println("No players in the game.");
            return;
        }
        Player temp = head;
        do {
            System.out.print(temp.getName() + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to " + head.getName() + ")");
    }
}
