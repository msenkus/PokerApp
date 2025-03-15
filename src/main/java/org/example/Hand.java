package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {
    private List<Card> cards = new ArrayList<>();

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public Hand(Card card1, Card card2) {
        this.cards.add(card1);
        this.cards.add(card2);
    }

    public Hand(Card... cards) {
        this.cards = Arrays.asList(cards);
    }

    public String getHandString(){
        return cards.stream().map(Card::getCardString).collect(Collectors.joining(" "));
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
}
