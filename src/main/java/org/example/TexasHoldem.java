package org.example;

import java.util.List;

public class TexasHoldem extends Game {

    Deck deck = new Deck();

    public TexasHoldem(Player... players){
       super(List.of(players));
    }

    @Override
    public void dealCards(){
        deck.shuffleDeck();
        for (Player player : players){
            player.setHand(new Hand(deck.drawCard(), deck.drawCard()));
        }
    }
}
