package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float a = 0, b = 0, resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextFloat();

        resultado = (a/b) + 1;
        System.out.println("El resultado es: " + resultado);

    }
}
