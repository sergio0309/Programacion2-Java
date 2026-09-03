package Ciclos.cicloDoWhile;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        String nombre = "";
        String hobbie = "";
        String observacion = "";
        int edad = 0, opcion;
        double altura = 0;
        char sexo = ' ';

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("############ MENU DE OPCIONES ############");
            System.out.println("1. Ingresar Datos Personales");
            System.out.println("2. Ingresar Interes");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:{
                    System.out.println("Ingrese su nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese su Altura");
                    altura = teclado.nextDouble();
                    System.out.println("Ingrese su edad: ");
                    edad = teclado.nextInt();
                    System.out.println("Ingrese su sexo: ");
                    sexo = teclado.next().charAt(0);
                } break;
                case 2:{
                    System.out.println("Ingrese su hobbie");
                    hobbie = teclado.nextLine();
                    System.out.println("Ingrese su observacion: ");
                    observacion = teclado.nextLine();
                } break;
                case 3: {
                    System.out.println("########## Datos Personales ##########");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Altura: " + altura);
                    System.out.println("Edad: " + edad);
                    System.out.println("Sexo: " + sexo);

                    System.out.println();
                    System.out.println("########## Intereses ##########");
                    System.out.println("Hobbie: " + hobbie);
                    System.out.println("Observación: " + observacion);

                } break;
                case 4:{
                    System.out.println("Programa finalizado.");
                } break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 4);

        teclado.close();
    }
}
