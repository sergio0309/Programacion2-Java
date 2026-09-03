package Ciclos.cicloWhile;

import java.util.Scanner;

public class EjecicioWhile {
    public static void main(String[] args) {
        int limite;
        int i=0;
        int total = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor Limite: ");
        limite = teclado.nextInt();

        while (i< limite){
            i += 1;
            System.out.println(i);
            total = total + i;
        }
        System.out.println("------------------------");
        System.out.println("El valor total es: " + total);
    }
}
