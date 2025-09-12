package org.example.ej5;

public class Rectangulo extends Forma {
    private double ancho;
    private double altura;

    public Rectangulo(String color, double ancho, double altura) {
        super(color);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ancho * altura;
    }

    @Override
    public double calvularPerimetro() {
        return 2 * ancho + 2 * altura;
    }
}


