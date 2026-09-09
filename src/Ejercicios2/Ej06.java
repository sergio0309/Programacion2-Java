package Ejercicios2;

import java.util.Scanner;

// 6.	Escriba un programa que lea de la entrada estándar un carácter
// e indique en la salida estándar si el carácter es una vocal minúscula, es una vocal mayúscula o no es una vocal.
public class Ej06 {
    public static void main(String[] args) {
        char vocal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el caracter: ");
        vocal = teclado.next().charAt(0);
        if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
            System.out.println("Es una vocal minuscula");
        } else if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
            System.out.println("Es una vocal MAYUSCULA");
        } else {
            System.out.println("No cumple con las condiciones");
        }
    }
}
