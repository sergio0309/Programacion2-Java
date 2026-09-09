package Ejercicios2;

import java.util.Scanner;

//1.	Escribe un programa que lea de la entrada estándar tres números.
// Después debe leer un cuarto número e indicar si el número coincide con alguno de los introducidos con anterioridad.
public class Ej08 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el 2do numero");
        num2 = sc.nextInt();
        System.out.println("Ingrese el 3er numero");
        num3 = sc.nextInt();

        System.out.println("Ingrese el 4to numero");
        num4 = sc.nextInt();

        String listaNumeros = num1 + ", " + num2 + " y " + num3;

        if (num4 == num1 || num4 == num2 || num4 == num3) {
            System.out.println("El numero ingresado (" + num4 + ") coincide con alguno de los numeros anteriores: " + listaNumeros);
        } else {
            System.out.println("El numero ingresado (" + num4 + ") no coincide con ninguno de los numeros anteriores: " + listaNumeros);
        }
    }
}