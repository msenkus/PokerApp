package org.example;

import java.awt.*;

public class Card {

    private String suit;
    private String value;
    private String rank;
    private Color color;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public Card(String suit, String value, Color color) {
        this.suit = suit;
        this.value = value;
        this.color = color;
    }

    public static String getCardString(Card card){
        return "Suit: " + card.suit + "\n" + "Value: " + card.value;
    }

    public String getStringValue(){
        return "Suit: " + this.suit + "\n" + "Value: " + this.value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
