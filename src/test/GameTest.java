package test;

import main.Card;
import main.Game;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    ArrayList<Card> hand = new ArrayList<>();
    Card card = new Card("a","hearts");
    Card card1 = new Card("a","hearts");
    Card card3 = new Card("a","hearts");
    Card card2 = new Card("k","hearts");
    Card card4 = new Card("j","hearts");

    @Test
    void fourOfKind() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertFalse(game.fourOfKind(hand));
    }

    @Test
    void fullHouse() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertFalse(game.fullHouse(hand));
    }

    @Test
    void flush() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertTrue(game.flush(hand));
    }

    @Test
    void threeOfKind() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertFalse(game.threeOfKind(hand));
    }

    @Test
    void twoPair() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertFalse(game.twoPair(hand));
    }

    @Test
    void onePair() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertTrue(game.onePair(hand));
    }

    @Test
    void search() {
        Game game = new Game();
        hand.add(card);
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.add(card4);
        assertEquals(3, Game.search(hand,"a"));
    }
}
