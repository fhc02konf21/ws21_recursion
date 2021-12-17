package org.campus02.sum;

import java.util.ArrayList;

public class Sum {

    /**
     * addiere alle zahlen von 0 - n (iterativ)
     *
     * @param n anzahl
     * @return summe
     */
    public int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum = sum + i; // addition
        }
        return sum;
    }

    /**
     * addiere alle zahlen von 0 - n (rekursiv)
     *
     * @param n anzahl
     * @return summe
     */
    public int sumUpRecursive(int n) {
        // Abbruchsbestimmung
        if (n <= 0) {
            return n;
        }
        // selbst wieder aufrufen
        return n + sumUpRecursive(n - 1);
    }

    /**
     * Bilde die Summe aller gegebenen Zahlen (iterativ)
     * @param numbers List von Nummern
     * @return Summe aller enthaltenen Zahlen
     */
    public int iterativeSum(ArrayList<Integer> numbers) {
        return 0;
    }

    /**
     * Bilde die Summe aller gegebenen Zahlen (iterativ)
     * @param numbers List von Nummern
     * @return Summe aller enthaltenen Zahlen
     */
    public int recursiveSum(ArrayList<Integer> numbers) {
        return 0;
    }

}
