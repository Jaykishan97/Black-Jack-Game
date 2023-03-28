# Blackjack Game
This is a simple implementation of the classic card game Blackjack, also known as 21. The game is played entirely in the console, using text-based input and output.

## Getting Started
To run the game, you will need to have Java installed on your computer. You can download Java from the official website: https://www.java.com/en/download/

Once you have Java installed, you can compile and run the game from the command line. Here's how:

    1. Open a terminal or command prompt.
    2. Navigate to the directory where you have saved the game files.
    3. Compile the Java files by running the command: `javac com/example/blackjack/*.java`
    4. Run the game by running the command: `java com.example.blackjack.Main`

## How to Play
The goal of the game is to have a hand value closer to 21 than the dealer's hand value, without going over 21 (busting).

    1. At the start of each round, you will be dealt two cards. The dealer will also be dealt two cards, but only one of them will be face-up.
    2. You will be prompted to hit (draw another card) or stand (keep your current hand). You can enter "hit" or "h" to draw another card, or "stand" or "s" to keep your current hand.
    3. If you go over 21 (bust), the game will end and you will lose.   
    4. Once you have chosen to stand, the dealer will take their turn. The dealer will draw cards until their hand value is 17 or higher.
    5. If the dealer goes over 21, you win. Otherwise, the winner is the player with the hand value closest to 21 without going over.
    6. You can play as many rounds as you like, and the game will keep track of your score.

## Troubleshooting
If you encounter any issues while running the game, try the following:

*  Make sure you have Java installed on your computer.
* Check that you are in the correct directory when running the Java commands.
* Make sure you are entering valid input when prompted by the game.

## Credits
The credit for the creation of this Blackjack game implementation goes to you, **Jayakishan Presingu**, who requested and modified the code. Thank you for giving me the opportunity to assist you in this project.
