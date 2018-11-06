package com.sparta.bz.model;

public class Card {

    private int value;
    private String suit;

    public Card( String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
