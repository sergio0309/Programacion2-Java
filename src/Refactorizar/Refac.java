package Refactorizar;
import java.util.Scanner;
public class Refac {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int firsNumber = setNumeros(scaner, "Ingrese el Primer Numero");
        int secondNumber = setNumeros(scaner, "Ingrese el Segundo Numero");
        OperacionesAritmeticas(firsNumber, secondNumber);
        Comparacion(firsNumber, secondNumber);
    }
    public static void Comparacion(int firsNumber, int secondNumber){
        if(firsNumber>secondNumber){
            System.out.println("El resultado es mayor a el primer numero");
        } else {
            System.out.println("El segundo numero es el mayor ");
        }
    }
    public static void OperacionesAritmeticas(int firs, int second){
        System.out.println("La suma de num1 + num2 ="+ (firs+second));
        System.out.println("La rest de num1 - num2 ="+ (firs-second));
    }
    public static int setNumeros(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }
}