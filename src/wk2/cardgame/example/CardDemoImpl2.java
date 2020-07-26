package wk2.cardgame.example;

public class CardDemoImpl2 implements Card_demo {
    private String name;
    private String color;
    private int point;

    // interface
    public int getPoint() {
        return point;
    }

    public CardDemoImpl2(String name, String color, int point) {
        this.name = name;
        this.color = color;
        this.point = point;
    }

    private static String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    // factory - interface
    public static Card_demo valueOf(int color, int name) {
        return new CardDemoImpl2(names[name], colors[color], points[name]);
    }

    // interface
    @Override
    public String toString() {
        return name + " of " + color;
    }
}
