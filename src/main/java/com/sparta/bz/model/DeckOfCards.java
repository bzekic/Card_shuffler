package com.sparta.bz.model;

import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> pack;

    public DeckOfCards(List<Card> cards) {
        this.pack = cards;
    }

    public List<Card> getPack() {
        return pack;
    }

    public void shuffledCards() {
        Collections.shuffle( pack );
    }
}
