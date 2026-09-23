package Ejercicios2;

import java.util.Scanner;

/*9. Cambiar un número entero con el mismo valor pero en romanos.
	M = 1000
	D = 500
	C = 100
	L = 50
	X = 10
	V = 5
	I = 1
*/
public class Ej09 {
    public static  void  main(String[] args){
        int num, unidades, decenas, centenas, millares;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a transformar:");
        num = sc.nextInt();
        System.out.println("El numero "+num+" en Romano es: ");
        //Fase 1: Descomposicion del numero
        unidades = num % 10;    // 2457 % 10 = 7
        num /= 10;              // numero pasa a ser 245
        decenas = num % 10;     // 245 % 10 = 5
        num /= 10;              // numero pasa a ser 24
        centenas = num % 10;    // 24 % 10 = 4
        num /= 10;              // numero pasa a ser 2
        millares = num % 10;    // 2 % 10 = 2
        switch (millares){
            case 1:
                System.out.println("M"); break;
            case 2:
                System.out.println("MM"); break;
            case 3:
                System.out.println("MMM"); break;
        }
        switch (centenas){
            case 1:
                System.out.println("C"); break;
            case 2:
                System.out.println("CC"); break;
            case 3:
                System.out.println("CCC"); break;
            case 4:
                System.out.println("CD"); break;
            case 5:
                System.out.println("D"); break;
            case 6:
                System.out.println("DC"); break;
            case 7:
                System.out.println("DCC"); break;
            case 8:
                System.out.println("DCCC"); break;
            case 9:
                System.out.println("CM"); break;
        }
        switch (decenas){
            case 1:
                System.out.println("X"); break;
            case 2:
                System.out.println("XX"); break;
            case 3:
                System.out.println("XXX"); break;
            case 4:
                System.out.println("XL"); break;
            case 5:
                System.out.println("L"); break;
            case 6:
                System.out.println("LX"); break;
            case 7:
                System.out.println("LXX"); break;
            case 8:
                System.out.println("LXXX"); break;
            case 9:
                System.out.println("XC"); break;
        }
        switch (unidades){
            case 1:
                System.out.println("I"); break;
            case 2:
                System.out.println("II"); break;
            case 3:
                System.out.println("III"); break;
            case 4:
                System.out.println("IV"); break;
            case 5:
                System.out.println("V"); break;
            case 6:
                System.out.println("VI"); break;
            case 7:
                System.out.println("VII"); break;
            case 8:
                System.out.println("VIII"); break;
            case 9:
                System.out.println("IX"); break;
        }
    }
}
