package Refactorizar;

import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingresar el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("La suma de num1 + num2 ="+ (num1+num2));
        System.out.println("La rest de num1 - num2 ="+ (num1-num2));
        if(num1>num2){
            System.out.println("El resultado es mayor a el primer numero");
        } else {
            System.out.println("El segundo numero es el mayor ");
        }
    }
}
