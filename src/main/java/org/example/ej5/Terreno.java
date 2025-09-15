package org.example.ej5;

public class Terreno implements ICalculable {
    private double ancho;
    private double largo;

    @Override
    public double calcularArea() {
        return ancho * largo;
    }

    @Override
    public double calcularPerimetro() {
        return ancho + ancho + largo + largo;
    }
}
