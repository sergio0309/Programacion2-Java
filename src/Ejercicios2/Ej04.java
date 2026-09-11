package Ejercicios2;

import java.util.Scanner;

//4.	Comprobar si un número digitado por el usuario es positivo o negativo.
public class Ej04 {
    public static void main(String[] args) {
        float numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor por teclado");
        numero = teclado.nextFloat();
        if(numero > 0){
            System.out.println("Es un numero positivo");
        } else if (numero < 0) {
            System.out.println("Es un numero negativo");
        }
        else {
            System.out.println("Es cero");
        }
        teclado.close();
    }
}
