package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 0, b = 0, aux = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("*********************");
        System.out.println("Valor cambiado de a: " + a);
        System.out.println("Valor cambiado de b: " + b);


    }
}
