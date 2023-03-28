package com.example.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int value = 0;
        int aces = 0;
        for (Card card : cards) {
            int cardValue = card.getValue();
            if (cardValue == 1) {
                aces++;
            }
            value += cardValue;
        }
        while (aces > 0 && value + 10 <= 21) {
            value += 10;
            aces--;
        }
        return value;
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
