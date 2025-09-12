package org.example.ej5;

public class Circulo extends Forma {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    //implementar de la clase abstracta
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calvularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
