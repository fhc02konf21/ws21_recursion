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
        return n + sumUpRecursive(n - 1); // annahme n = 3 => 3 + 2 + 1 + 0
        // 3 + sumUpRecursive(2)
        // 3 + 2 + sumUpRecursive(1)
        // 3 + 2 + 1 + sumUpRecursive(0)
        // 3 + 2 + 1 + 0
        // 6
    }

    /**
     * Bilde die Summe aller gegebenen Zahlen (iterativ)
     * @param numbers List von Nummern
     * @return Summe aller enthaltenen Zahlen
     */
    public int iterativeSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
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
