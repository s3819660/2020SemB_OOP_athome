package wk2.cardgame.example;

public class Card_highend {
    protected int rank;
    protected int suit;

    public final static int MAX_RANK = 13;
    public final static int MIN_RANK = 1;

    public final static int MAX_SUIT = 4;
    public final static int MIN_SUIT = 1;

    public int getPoint() {
        return 0;
    }

    public Card_highend(int rank, int suit) {
        if(rank > MAX_RANK || rank < MIN_RANK || suit > MAX_SUIT || suit < MIN_SUIT) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
        System.out.println("Card constructor");
    }

    public static void main(String[] args) {
        Card_highend c1 = new Card_highend(1, 4);
        Card_highend c2 = new Card_highend(1, 3);
    }
}
