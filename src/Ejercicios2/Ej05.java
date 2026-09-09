package Ejercicios2;

import java.util.Scanner;

//5.	Escriba un programa que lea de la entrada estándar un carácter
// e indique en la salida estándar si el carácter es una vocal minúscula o no.
public class Ej05 {
    public static void main(String[] args) {
        char vocal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el caracter: ");
        vocal = teclado.next().charAt(0);
        /*
            switch (vocal) {
                case 'a':{
                    System.out.println("Es una vocal minuscula");
                    break;
                }
                case 'e':{
                    System.out.println("Es una vocal minuscula");
                    break;
                }
                case 'i':{
                    System.out.println("Es una vocal minuscula");
                    break;
                }
                case 'o':{
                    System.out.println("Es una vocal minuscula");
                    break;
                }
                case 'u':{
                    System.out.println("Es una vocal minuscula");
                    break;
                }
                default:{
                    System.out.println("No cumple con las condiciones");
                }
            }

        */
        if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
            System.out.println("Es una vocal minuscula");
        } else {
            System.out.println("No cumple con las condiciones");
        }
    }
}
