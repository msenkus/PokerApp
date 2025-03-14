package org.example;

import java.util.Arrays;
import java.util.List;

public abstract class Game{
    List<Player> players;
    String gameName;
    boolean gameOver;
    double pot;

    public Game(List<Player> players){
        this.players = players;
    }

    public abstract void dealCards();
}
