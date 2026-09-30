package POO;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        String name;
        int age;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        name = sc.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la sexo de la persona: ");
        sexo = sc.nextLine();
        sc.close();
        Persona persona1 = new Persona(name, age, sexo);

        persona1.datos();
    }
}
