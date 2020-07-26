package wk2.cardgame.example;

public interface Card_demo {
    int getPoint();

    static Card_demo valueOf(int color, int name) {
        return CardDemoImpl2.valueOf(color, name);
    }
}
