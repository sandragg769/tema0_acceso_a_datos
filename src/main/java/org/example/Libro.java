package org.example;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int totalLibros = 1;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        // no poner total libros ya que por defecto es 1
    }

    public Libro(String titulo, String autor, double precio, int totalLibros) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.totalLibros = totalLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(int totalLibros) {
        this.totalLibros = totalLibros;
    }

    public double calcularPrecioFinal() {
        LocalDate hoy = LocalDate.now();
        if (hoy.getDayOfWeek().equals(5)) {
            return precio * 0.9;
        } else {
            return precio;
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Alguno", "Alguno");
        // sale 0 pq no le hemos asignado precio
        System.out.println("Precio libro 1:" + libro1.calcularPrecioFinal());

        Libro libro2 = new Libro("Otro", "Otro", 20, 4);
        // ahora si sale pq usando el constructor 2 si ponemos el precio
        System.out.println("Precio libro 2:" + libro2.calcularPrecioFinal());

        System.out.println("Total de libros del libro 1: " + libro1.totalLibros);
        System.out.println("Total de libros del libro 2: " + libro2.totalLibros);

    }
}