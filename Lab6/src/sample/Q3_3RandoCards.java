package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

class Card {
    // possible ranks, suits and points a card has
    String[] POSSIBLE_RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] POSSIBLE_SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    int[] POSSIBLE_POINTS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    // a card's properties
    String rank;
    String suit;
    int point;
    String imageName;

    // Constructor to initialize a card with rank ranges from 0-13 and suit ranges from 0-3
    public Card(int rank, int suit) {
        this.rank = POSSIBLE_RANKS[rank];
        this.suit = POSSIBLE_SUITS[suit];
        this.point = POSSIBLE_POINTS[rank];
        this.imageName = ((rank + 1) * (suit + 1)) + ".png"; // automatically to String
    }

    // get rank
    public String getRank() {
        return this.rank;
    }

    // get suit
    public String getSuit() {
        return this.suit;
    }

    // get imageName
    public String getImageName() {
        return this.imageName;
    }

    // get point of a card
    public int getPoint() {
        return point;
    }
}

class CardDeck {
    // Initialize the card deck
    ArrayList<Card> cards = new ArrayList<>();

    // Initialize 52 cards to the card deck
    public CardDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new Card(j, i));
            }
        }
    }

    // get 3 random cards from the 52-card deck
    public Card[] get3Cards() {

        // copy the main deck into a temporary arrayList
        // so that the original deck is intact even when removing
        // its elements
        ArrayList<Card> temp_deck = cards;

        Random random = new Random();
        Card[] cardsGUI = new Card[3];
        for (int i = 0; i < 3; i++) {
            // pick a random card from the temporary deck
            // read ArrayList's get() method
            Card pickedCard = temp_deck.get(random.nextInt(temp_deck.size()));

            cardsGUI[i] = pickedCard;

            // remove so picked card from the temporary deck
            // so it can't be picked again
            temp_deck.remove(pickedCard);
        }
        return cardsGUI;
    }
}

public class Q3_3RandoCards {
    public int sumCardPoints(Card[] cards) {
        return cards[0].getPoint() + cards[1].getPoint() + cards[2].getPoint();
    }

    public GridPane mainScene() {
        GridPane randomCardsPane = new GridPane();
        CardDeck cardDeck = new CardDeck();
        Card[] randomCards = cardDeck.get3Cards();
        for (int i = 0; i < 3; i++) {
            String path = "./resources/cards/" + randomCards[i].getImageName();
            Image img = new Image(new File(path).toURI().toString());
            ImageView view = new ImageView();
            view.setImage(img);
            view.setFitHeight(300);
            view.setFitWidth(200);
            randomCardsPane.add(view, i, 0);
        }
        Text text = new Text();
        text.setFont(new Font(20));
        text.setWrappingWidth(200);
        text.setTextAlignment(TextAlignment.CENTER);
        text.setText(sumCardPoints(randomCards) + " points");
        randomCardsPane.add(text, 1, 2);
        return randomCardsPane;
    }
}
