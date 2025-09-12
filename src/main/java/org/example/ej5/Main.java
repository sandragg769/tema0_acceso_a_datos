package org.example.ej5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Azul", 4);
        Circulo circulo2 = new Circulo("Verde", 5);
        Rectangulo rectangulo1 = new Rectangulo("Rosa", 4, 6);

        Rectangulo rectangulo2 = new Rectangulo("Rojo", 6, 9);

        System.out.println("Mostrar color de rectangulo");
        rectangulo1.mostrarColor();
        System.out.println("Perímetro de rectangulo: " + rectangulo1.calvularPerimetro());
        System.out.println("Área de rectangulo: " + rectangulo1.calcularArea());

        System.out.println("Mostrar color de circulo");
        circulo1.mostrarColor();
        System.out.println("Perímetro de circulo: " + circulo1.calvularPerimetro());
        System.out.println("Área de circulo: " + circulo1.calcularArea());

        List<Forma> lista = new ArrayList<>();
        lista.add(rectangulo1);
        lista.add(rectangulo2);
        lista.add(circulo1);
        lista.add(circulo2);

        for (Forma f : lista) {
            System.out.println("Perímetro " + f.getClass() + " : " + f.calvularPerimetro());
            System.out.println("Área " + f.getClass() + " : " + f.calcularArea());
            System.out.println("Perímetro " + f.getClass() + " : ");
            //sin terminar

        }

    }
}
