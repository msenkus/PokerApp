package org.example;

import org.junit.jupiter.api.Test;

class DeckTest {

    @Test
    void deckBuilder() {
        Deck newDeck = new Deck();
        newDeck.deckBuilder();
        newDeck.shuffleDeck();
        newDeck.getDeck().forEach(card -> {
            System.out.println(card.getCardString(card));
        });
    }

    @Test
    public void testShuffle(){
        Deck newDeck = new Deck();
        newDeck.deckBuilder();
        newDeck.shuffleDeck();
        while (newDeck.getDeck().size() > 0){
            Card cd = newDeck.drawCard();
            System.out.println(cd.getCardString(cd));
            System.out.println(newDeck.getDeck().size());
        }
    }

    @Test
    public void testHand() {
        Deck newDeck = new Deck();
        newDeck.deckBuilder();
        newDeck.shuffleDeck();
        Hand newHand = new Hand(newDeck.drawCard(), newDeck.drawCard());
        System.out.println(newHand.getHandString());
    }
}