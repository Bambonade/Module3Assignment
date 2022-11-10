package main;

import java.util.ArrayList;
public class Game {
    public Game() {

    }

    public boolean fourOfKind(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) >= 4) return true;
        }
        return false;
    }

    public boolean fullHouse(ArrayList<Card> array) {
        return threeOfKind(array) && twoPair(array);
    }

    public boolean flush(ArrayList<Card> array) {

        String suit = array.get(0).getSuit();
        for (Card card : array) {
            if (!card.getSuit().equals(suit)) return false;
        }
        return true;
    }

    public boolean threeOfKind(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) >= 3) return true;
        }
        return false;
    }

    public boolean twoPair(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.size() > 4) {
                for (int j = i + 1; j < array.size();  j++) {
                    if (array.get(j).getFace().equals(array.get(i).getFace())) {
                        array.remove(j);
                        array.remove(i);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.size() > 2) {
                for (int j = i + 1; j < array.size(); j++) {
                    if (array.get(j).getFace().equals(array.get(i).getFace())) {
                        array.remove(j);
                        array.remove(i);
                        break;
                    }
                }
            }
        }
        return array.size() == 1;
    }

    public boolean onePair(ArrayList<Card> array) {
        for (int i = 0; i < array.size(); i++) {
            if (search(array, array.get(i).getFace()) >= 2) return true;
        }
        return false;
    }

    public static int search(ArrayList<Card> array, String input) {
        int counter = 0;
        for (Card card : array) {
            if (input.equals(card.getFace())) counter++;
        }
        return counter;
    }
}