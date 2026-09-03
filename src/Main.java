import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        int edad;
        float altura;
        String nombre;

        // Crear objeto Scanner para ingresar por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre Completo: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese su altura: ");
        altura = teclado.nextFloat();

        System.out.println("---------- Datos Personales ----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        teclado.close();
    }
}