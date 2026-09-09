package Ejercicios2;

//3.	Realice un programa que lea un valor entero y determine si se trata de un número par o impar.

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor por teclado");
        numero = teclado.nextInt();
        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
