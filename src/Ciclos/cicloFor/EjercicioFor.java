package Ciclos.cicloFor;

import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {
        int limite;
        int total = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor limite:");
        limite = teclado.nextInt();
        for (int i = 0; i <= limite; i = i + 2) {
            System.out.println(i);
            total += i;
        }

        System.out.println("El valor total es: " + total);

    }
}
