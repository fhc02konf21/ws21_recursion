package org.campus02.factorial;

public class Factorial {

    /**
     * Multipliziere alle Zahlen von 0 - n
     * @param n anzahl
     * @return Produkt der Multiplikationen
     */
    public int fact(int n) {
        // abbruchbestimmung
        if (n == 1) {
            return 1;
        }
        // selbst wieder aufrufen
        return n * fact(n - 1);
        // 5 * fact(4)
        // 5 * 4 * fact(3)
        // 5 * 4 * 3 * fact(2)
        // 5 * 4 * 3 * 2 * fact(1)
        // 5 * 4 * 3 * 2 * 1 ==> das wird schlussendlich berechnet
    }
}
