package com.example.blackjack;

import java.util.Scanner;

public class Game {
    private final Deck deck;
    private final Hand playerHand;
    private final Hand dealerHand;

    public Game() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Welcome to Blackjack!");

        // Deal initial cards
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());

        // Show initial hands
        System.out.println("Dealer's hand:");
        dealerHand.printCards();
        System.out.println("---------------");
        System.out.println("Player's hand:");
        playerHand.printCards();

        // Player's turn
        while (playerHand.getValue() < 21) {
            System.out.print("Hit or stand? (h/s) ");
            String choice = scanner.nextLine();
            if (choice.equals("h")) {
                playerHand.addCard(deck.drawCard());
                System.out.println("Player's hand:");
                playerHand.printCards();
            } else if (choice.equals("s")) {
                break;
            }
        }

        // Dealer's turn
        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.drawCard());
        }
        System.out.println("Dealer's hand:");
        dealerHand.printCards();

        // Determine winner
        int playerValue = playerHand.getValue();
        int dealerValue = dealerHand.getValue();
        if (playerValue > 21) {
            System.out.println("Player busts! Dealer wins.");
            
        } else if (dealerValue > 21) {
            System.out.println("Dealer busts! Player wins.");
            
        } else if (playerValue > dealerValue) {
            System.out.println("Player wins!");
           
        } else if (dealerValue > playerValue) {
            System.out.println("Dealer wins.");
            
        } else {
            System.out.println("Push.");
        }

        // Ask to play again
        System.out.println("-------------------");
        System.out.print("Play again? (y/n) ");
        String choice = scanner.nextLine();
        if (choice.equals("y")) {
            System.out.println();
            play();
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}
