package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private final String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    List<Card> deck = new ArrayList<>();

    public void deckBuilder(){
        for (String suit : suit) {
            for (String val : value) {
                Card card = new Card(suit, val);
                this.deck.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    public Card drawCard(){
        return deck.isEmpty() ? null : this.deck.remove(0);
    }

    public List<Card> getDeck() {
        return this.deck;
    }
}
