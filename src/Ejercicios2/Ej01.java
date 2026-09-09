package Ejercicios2;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        int var1;
        int var2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        var1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        var2 = teclado.nextInt();


        if( var1 > var2){
            System.out.println("El primer valor es mayor que el segundo");
        } else {
            System.out.println("El segundo valor es mayor que el primero");
        }

        teclado.close();
    }
}
