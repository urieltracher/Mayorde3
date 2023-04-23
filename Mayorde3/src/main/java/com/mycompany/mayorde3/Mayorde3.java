

package com.mycompany.mayorde3;


import java.util.Scanner;



public class Mayorde3 {

    private double numero1;
    private double numero2;
    private double numero3;

    
    public Mayorde3(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    
    public void establecerNumero1(double numero1) {
        this.numero1 = numero1;
    }

    
    public double obtenerNumero1() {
        return numero1;
    }

    
    public void establecerNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
    public double obtenerNumero2() {
        return numero2;
    }

    
    public void establecerNumero3(double numero3) {
        this.numero3 = numero3;
    }

    
    public double obtenerNumero3() {
        return numero3;
    }

    
    public double obtenerMayor() {
        double mayor = 0;
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                mayor = numero1;
            } else {
                mayor = numero3;
            }
        } else if (numero2 > numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3;
        System.out.print("Introduzca el primer número real: ");
        numero1 = entrada.nextDouble();
        System.out.print("Introduzca el segundo número real: ");
        numero2 = entrada.nextDouble();
        System.out.print("Introduzca el tercer número real: ");
        numero3 = entrada.nextDouble();
        Mayorde3 mayorde3 = new Mayorde3(numero1, numero2, numero3);
        System.out.println("El mayor es " + mayorde3.obtenerMayor());
    }
}
