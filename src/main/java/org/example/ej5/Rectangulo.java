package org.example.ej5;

//inmutabilidad de la clase se pone final antes de class
public class Rectangulo extends Forma implements ICalculable {
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
    public double calcularPerimetro() {
        return 2 * ancho + 2 * altura;
    }
}


