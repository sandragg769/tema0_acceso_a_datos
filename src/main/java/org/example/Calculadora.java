package org.example;

public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sumar(2.5, 3.6));
        System.out.println(sumar(2, 3));
        System.out.println(sumar(2, 3, 4));

    }
}