package com.sparta.bz.model;

import java.util.ArrayList;
import java.util.List;

public class CardShuffler {

    public DeckOfCards CreatePack() {
        List<Card> pack = new ArrayList<>();
        for (Suits suit : Suits.values()) {
            for (CardValues cards : CardValues.values()) {
                pack.add( new Card( suit.getSymbol(), cards.getValue() ) );
            }
        }
        return new DeckOfCards(pack);
    }

    public void displayCards(List<Card> pack) {
        for (Card card : pack) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }
    }
}



