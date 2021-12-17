package org.campus02.ggt;

public class GGT {

    /**
     * Finde den größen gemeinsamen Teiler (iterativ)
     * @param a Zahl 1
     * @param b Zahl 2
     * @return größter gemeinsamer teiler
     */
    public int ggtIterative(int a, int b) {
        while (b != 0) {
            int rest = a % b; // berechne den restwert der division
            a = b;  // ersetze a durch b
            b = rest; // ersetze b durch den restwert
        }
        return a; // retourniere a wenn b == 0
    }

    /**
     * Finde den größen gemeinsamen Teiler (rekursiv)
     * @param a Zahl 1
     * @param b Zahl 2
     * @return größter gemeinsamer teiler
     */
    public int ggtRecursive(int a, int b) {
        // if b gleich 0, dann retourniere a
        // ansonsten ersetze a durch b und b durch den restwert der division (a/b)
        if (b == 0) {
            return a;
        }
        return ggtRecursive(b, a % b);
    }
}
