package wk2.cardgame.example;

import wk2.cardgame.example.Card_demo;

import java.util.Random;

public class CardGame_demo {
    public static void main(String[] args) {
        Card_demo[] cardDemos = new Card_demo[52];

        int n = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                cardDemos[n] = Card_demo.valueOf(i, j);
                n++;
            }
        }

        int sum = 0;
        Random random = new Random();
        for(int i = 0; i < 3; i++) {
            int index = random.nextInt(52);
            sum += cardDemos[index].getPoint();
            System.out.printf("%s ", cardDemos[index]);
        }
        System.out.printf("\nsum = %d\n", sum);
    }
}
