package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @modifier Navnit Pannu
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        
        System.out.print("Enter a card value (1-13): ");
        int guessedValue = input.nextInt();
        
        System.out.println("Choose a suit:");
        System.out.println("1. Hearts");
        System.out.println("2. Diamonds");
        System.out.println("3. Spades");
        System.out.println("4. Clubs");
        System.out.print("Enter a suit (1-4): ");
        int guessedSuit = input.nextInt();
        
        Card guessedCard = new Card();
        guessedCard.setValue(guessedValue);
        guessedCard.setSuit(Card.SUITS[guessedSuit - 1]);
        
       for (int i = 0; i < hand.length; i++) {
        if (hand[i].getValue() == guessedCard.getValue()
            && hand[i].getSuit().equals(guessedCard.getSuit())) {
                printInfo();
                break;
               }
            }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Navnit Pannu.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Graduate from Computer Programming");
        System.out.println("-- Build a career in IT");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Ice skating");
        System.out.println("-- Cooking");
        System.out.println("-- Learning about technology");
        System.out.println("-- Swimming");

        System.out.println();
        
    
    }

}
