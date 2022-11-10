package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> hand = new ArrayList<>();

        Card card = new Card("a","hearts");
        Card card1 = new Card("a","hearts");
        Card card3 = new Card("a","hearts");
        Card card2 = new Card("k","hearts");
        Card card4 = new Card("j","hearts");

        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);

        Game game = new Game();

        //System.out.println(game.flush(hand));
        //System.out.println(game.threeOfKind(hand));
        //System.out.println(game.fourOfKind(hand));
        System.out.println(game.fullHouse(hand));
        //System.out.println(game.onePair(hand));
        //System.out.println(game.twoPair(hand));
    }
}