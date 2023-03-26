import java.util.ArrayList;
import java.util.*;

class Deck {
    private static String[] suits = {"clubs", "Diamonds", "Hearts", "spades"};
    private static String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace",};

    ArrayList<String> createDeck() {
        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : Ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }
     String[][] distributeCards(ArrayList<String> deck) {
        String[][] playerCards = new String[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                playerCards[i][j] = deck.get(i * 9 + j);
            }
        }
        return playerCards;
    }
     public void printCards(String[][] playerCards){
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
            System.out.println();
        }
    }
    }

public class DeckOfCards {
    public static void main(String [] args){
        Deck d1=new Deck();
        ArrayList<String>deck=d1.createDeck();
        Collections.shuffle(deck,new Random());
        String[][]playerCards=d1.distributeCards(deck);
        d1.printCards(playerCards);
    }
}
