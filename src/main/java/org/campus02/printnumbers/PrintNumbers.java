package org.campus02.printnumbers;

public class PrintNumbers {

    public static void main(String[] args) {
        fromNToZero(5);
    }

    /**
     * iterativ
     * @param n
     */
    public static void fromNToZero(int n) {
        while (n >= 0) {
            System.out.println("n = " + n);
            n --;
        }
    }


}
