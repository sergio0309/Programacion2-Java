//2.	Escriba un programa que lea tres números y determine cuál de ellos es el mayor
package Ejercicios2;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        int var1;
        int var2;
        int var3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        var1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        var2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el tercer valor: ");
        var3 = teclado.nextInt();

        if (var1 > var2 && var1 > var3) {
            System.out.println("El primer valor es mayor que el segundo");
        }
        else if (var2 > var3 && var2 > var1) {
            System.out.println("el segundo valor es mayor que el tercer");
        }
        else if (var3 > var1 && var3 > var2){
            System.out.println("el tercer valor es mayor que el primero");
        }
        teclado.close();
    }
}
