package wk2.cardgame.example;

import java.util.HashMap;
import java.util.Map;

// This implementation uses "Map" to store point
public class CardDemoImpl1 implements Card_demo {
    private String name;
    private String color;

    // interface
    public int getPoint() {
        return points.get(this.name);
    }

    public CardDemoImpl1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private static String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // private static int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    private static Map<String, Integer> points = new HashMap<String, Integer>();

    static {
        points.put("Ace", 1);
        points.put("2", 2);
        points.put("3", 3);
        points.put("4", 4);
        points.put("5", 5);
        points.put("6", 6);
        points.put("7", 7);
        points.put("8", 8);
        points.put("9", 9);
        points.put("10", 10);
        points.put("Jack", 10);
        points.put("Queen", 10);
        points.put("King", 10);
    }

    // factory - interface
    public static Card_demo valueOf(int color, int name) {
        return new CardDemoImpl1(names[name], colors[color]);
    }

    // interface
    @Override
    public String toString() {
        return name + " of " + color;
    }
}
