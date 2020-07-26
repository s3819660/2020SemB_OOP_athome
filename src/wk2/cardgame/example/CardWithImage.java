package wk2.cardgame.example;

public class CardWithImage extends Card_highend {
    private String imageUrl;

    // this constructor is used to create an object of the parent class as well as initiate the object
    public CardWithImage(int rank, int suit) {
        super(rank, suit);
        System.out.println("CardWithImage constructor");
    }

    public String getImage() {
        return imageUrl;
    }

    public static void main(String[] args) {
        CardWithImage c1 = new CardWithImage(4, 4);

        // downcasting, c2 cannot revoke CardWithImage's methods
        Card_highend c2 = new CardWithImage(4,4);

        Object c3 = new CardWithImage(4, 4);
    }
}
