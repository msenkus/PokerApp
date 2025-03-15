package org.example;

import java.util.LinkedList;
import java.util.List;

public class TexasHoldem extends Game {

    Deck deck = new Deck();
    Hand communityCards = new Hand();

    public TexasHoldem(Player... players){
       super(List.of(players));
    }

    @Override
    public void dealCards(){
        gameOver = false;
        deck.shuffleDeck();
//        for (Player player : players){
//            player.setHand(new Hand(deck.drawCard(), deck.drawCard()));
//        }




    }

    public void shiftPosition(){

    }
}
