package org.example.ej5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Azul", 4);
        Circulo circulo2 = new Circulo("Verde", 5);
        Rectangulo rectangulo1 = new Rectangulo("Rosa", 4, 6);
        Rectangulo rectangulo2 = new Rectangulo("Rojo", 6, 9);
        Rectangulo terreno1 = new Rectangulo("Amarillo", 4, 6);
        Rectangulo terreno2 = new Rectangulo("Negro", 6, 9);

        //List es la definición, implementación es el ArrayList, es la subclase de List (polimorfismo)
        List<ICalculable> lista = new ArrayList<>();
        lista.add(rectangulo1);
        lista.add(rectangulo2);
        lista.add(circulo1);
        lista.add(circulo2);
        lista.add(terreno1);
        lista.add(terreno2);


        //tipo estático forma
        //tipo dinámico circulo y rectangulo, va cambiando
        for (ICalculable f : lista) {
            //para poder mostrar el color necesitariamos un IPintalbe (interfaz) para los que se puedan pintar
            System.out.println("Perímetro " + f.getClass().getSimpleName() + " : " + f.calcularPerimetro());
            System.out.println("Área " + f.getClass().getSimpleName() + " : " + f.calcularArea());

        }

    }
}
