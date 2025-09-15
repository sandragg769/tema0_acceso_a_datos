package org.example.ej5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Forma implements ICalculable {
    //protected para los hijos
    protected String color;

    //poner el constructor
    public Forma(String color) {
        this.color = color;
    }

    //no static
    public void mostrarColor() {
        System.out.println(color);
    }

}