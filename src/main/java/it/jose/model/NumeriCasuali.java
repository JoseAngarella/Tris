package it.jose.model;

import java.util.Random;

public class NumeriCasuali {
    private static Random r = new Random();

    public static int generaInteroFinoA(int n) {
        // Genera un numero casuale tra 0 e 3 inclusi
        return r.nextInt(n + 1);
    }

}
