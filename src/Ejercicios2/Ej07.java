package Ejercicios2;

import java.util.Scanner;

//7.	Escriba un programa que solicite una edad (un entero) e indique en la salida estándar
// si la edad introducida está en el rango [18-25].
public class Ej07 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if(edad >= 18 && edad <= 25){
            System.out.println("Esta dentro del rango de edad");
        } else {
            System.out.println("No esta dentro del rango de edad");
        }
    }
}
