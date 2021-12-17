package org.campus02.fibonacci;

public class Fibonacci {

    /**
     * retournieren Sie den Wert der n-ten Fibonacci Stelle
     * zB: fib(10) = 55
     *
     * @param n Stelle der Fibonacci Zahl
     * @return  Wert der n-ten Stelle
     */
    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
