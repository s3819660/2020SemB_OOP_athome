package wk2.cardgame;
import java.util.ArrayList;
import java.util.Random;

class Card {
    // Possible names of a card
    String[] POSSIBLE_NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] POSSIBLE_SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    int[] POSSIBLE_POINTS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    // A card's properties
    String name;
    String suit;
    int point;

    // Constructor card with name and suit with name range in 0-12, suit range in 0-3
    public Card(int name, int suit) {
        this.name = POSSIBLE_NAMES[name];
        this.suit = POSSIBLE_SUITS[suit];
        this.point = POSSIBLE_POINTS[name];
    }

    public int getPoint() {
        return point;
    }

    // Get name and suit of a card in a single string
    public String getName() {
        return name + " of " + suit;
    }
}

class CardDeck {
    // Initialize card deck
    ArrayList<Card> cards = new ArrayList<>();

    // Add initial 52 card to the cards arrayList
    public CardDeck() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
                cards.add(new Card(j, i));
    }

    // Get 3 random cards from the deck
    public void get3Card() {
        // copy the main deck into a temporary array so that the original deck is intact
        ArrayList<Card> temp_deck = cards;

        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            // get a random card from the temp deck
            Card pickedCard = temp_deck.get(random.nextInt(temp_deck.size()));

            System.out.println(pickedCard.getName());
            sum += pickedCard.getPoint();

            // remove the picked card from the temp deck so it cant be picked again
            temp_deck.remove(pickedCard);
        }
        System.out.println("sum = " + sum);
    }
}

public class CardGame_simple {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.get3Card();
    }
}
