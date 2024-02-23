package org.example.games.variables;

import org.example.games.Game;
import org.example.random.Random;

public class BlackJack {
    public static String getResult() {
        Game blackJack = new Game("BlackJack", new double[]{7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692, 7.692307692307692});

        int result = Random.generateSecureRandomNumbers(blackJack);

        return switch (result) {
            case 0 -> "2";
            case 1 -> "3";
            case 2 -> "4";
            case 3 -> "5";
            case 4 -> "6";
            case 5 -> "7";
            case 6 -> "8";
            case 7 -> "9";
            case 8 -> "10";
            case 9 -> "Jack";
            case 10 -> "Queen";
            case 11 -> "King";
            case 12 -> "Ace";
            default -> null;
        };
    }
}