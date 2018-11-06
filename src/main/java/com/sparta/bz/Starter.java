package com.sparta.bz;

import com.sparta.bz.model.CardShuffler;
import com.sparta.bz.model.DeckOfCards;

public class Starter
{
    public static void main( String[] args )
    {
        CardShuffler cardShuffler = new CardShuffler();
        DeckOfCards deck = cardShuffler.CreatePack();
        deck.shuffledCards();
        cardShuffler.displayCards( deck.getPack());
    }
}
