package org.example;

public class Player {
    private String name;
    private String uniqueID;
    private String position;
    private Hand hand;

    public Player() {
    }

    public Player(String uniqueID, String position, Hand hand) {
        this.uniqueID = uniqueID;
        this.position = position;
        this.hand = hand;
    }

    public Player(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
