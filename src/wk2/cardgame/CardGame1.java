package wk2.cardgame;
import java.util.ArrayList;
import java.util.Random;

class Card1 {
    // possible ranks, suits and points a card has
    String[] POSSIBLE_RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] POSSIBLE_SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    int[] POSSIBLE_POINTS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    // a card's properties
    String rank;
    String suit;

    int point;

    // Constructor to initialize a card with rank ranges from 0-13 and suit ranges from 0-3
    public Card1(int rank, int suit) {
        this.rank = POSSIBLE_RANKS[rank];
        this.suit = POSSIBLE_SUITS[suit];
        this.point = POSSIBLE_POINTS[rank];
    }

    // get name and suit of a card
    public String getRankandSuit() {
        return this.rank + " of " + this.suit;
    }

    // get point of a card
    public int getPoint() {
        return point;
    }
}

class CardDeck1 {
    // Initialize the card deck
    ArrayList<Card1> card1s = new ArrayList<>();

    // Initialize 52 cards to the card deck
    public CardDeck1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card1s.add(new Card1(j, i));
            }
        }
    }

    // get 3 random cards from the 52-card deck
    public void get3Card1s() {
        // copy the main deck into a temporary arrayList
        // so that the original deck is intact even when removing
        // its elements
        ArrayList<Card1> temp_deck1 = card1s;

        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            // pick a random card from the temporary deck
            Card1 pickedCard1 = temp_deck1.get(random.nextInt(temp_deck1.size()));

            System.out.println(pickedCard1.getRankandSuit());
            sum += pickedCard1.getPoint();

            // remove so picked card from the temporary deck
            // so it can't be picked again
            temp_deck1.remove(pickedCard1);
        }
        System.out.println("sum = " + sum);
    }
}

public class CardGame1 {
    public static void main(String[] args) {
        CardDeck1 deck1 = new CardDeck1();
        deck1.get3Card1s();
    }
}
