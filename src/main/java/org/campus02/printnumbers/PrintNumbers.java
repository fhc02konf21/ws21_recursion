package org.campus02.printnumbers;

public class PrintNumbers {

    public static void main(String[] args) {
        //fromNToZero(5);
        //fromNToZeroRecursiv(5);
        fromZeroToNRecursiv(5);
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

    public static void fromNToZeroRecursiv(int n) {
        // abbruchsbestimmung
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        fromNToZeroRecursiv(n - 1);
    }

    public static void fromZeroToNRecursiv(int n) {
        if (n < 0) {
            return;
        }
        fromZeroToNRecursiv(n - 1);
        System.out.println("n = " + n);
    }
}
