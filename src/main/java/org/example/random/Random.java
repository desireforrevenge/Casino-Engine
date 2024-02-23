package org.example.random;

import org.example.games.Game;

import java.security.SecureRandom;

public class Random {
    public static int generateSecureRandomNumbers(Game game) {
        SecureRandom secureRandom = new SecureRandom();

        double randomNumber = secureRandom.nextDouble(100) + 1;

        for (int i = 0; i < game.chances().length; i++) {
            if (randomNumber - game.chances()[i] <= 0) {
                return i;
            } else {
                randomNumber = randomNumber - game.chances()[i];
            }
        }
        return 0;
    }
}
