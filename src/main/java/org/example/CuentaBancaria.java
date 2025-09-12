package org.example;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo = 0;
    // no hay que usar???
    private final int tasaInteres = 2;

    // el saldo es 0 al principio
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // no setter para que solo se pueda modificar por retirar o depositar
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No se puede ingresar, cantidad negativa o 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo && cantidad > 0) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar, cantidad negativa o superior a el saldo.");
        }
    }

}