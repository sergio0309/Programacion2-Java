package ProyectoNombre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaEstudiantil {
    private GestorArchivo gestorArchivo;
    private Scanner teclado;
    public SistemaEstudiantil(String rutaArchivo) {
        this.gestorArchivo = new GestorArchivo(rutaArchivo);
        this.teclado = new Scanner(System.in);
    }
    void registrarEstudiante(){
        System.out.println("\n--- REGISTRAR ESTUDIANTE ---\n");
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine().trim();  //Lee el texto y elimina los espacios sobrantes
        System.out.println("Ingrese el edad del estudiante: ");
        String edadTexto =  teclado.nextLine().trim();
        System.out.println("Ingrese el carrera del estudiante: ");
        String carrera = teclado.nextLine().trim();
        //validar si los campos estan completos
        if(nombre.isEmpty() || edadTexto.isEmpty() || carrera.isEmpty()){
            System.out.println("\nError. Todos los campos son obligatorios");
            return;
        }
        int edad;
        //Convertir una entra string a int
        try {
            edad = Integer.parseInt(edadTexto);
        } catch (NumberFormatException e) {
            System.out.println("\nError. La edad debe ser un dato numerico");
            return;
        }
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, carrera);

        if(gestorArchivo.guardarEstudiantes(nuevoEstudiante)){
            System.out.println("Estudiante guardado correctamente.");
        } else {
            System.out.println("\nError. No se puede guardar el estudiante.");
        }
    }

    void leerEstudiantes(){
        System.out.println("\n--- LISTA DE ESTUDIANTES REGISTRADOS ---\n");
        if(!gestorArchivo.existeArchivo()){
            System.out.println("No hay registros guardados");
            return;
        }
        List<String> registros = gestorArchivo.obtenerRegistros();

        //Comprobar si la lista tiene registros
        if(registros.isEmpty()){
            System.out.println("El archivo esta vacio");
        }else {
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }

    public  void iniciar(){
        int opcion;
        do {
            System.out.println("\n===================================\n");
            System.out.println("   SISTEMA DE CONTROL DE ESTUDIANTE   ");
            System.out.println("1. Registrar Estudiante.");
            System.out.println("2. Mostrar Lista de Estudiantes.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opcion: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }
            switch (opcion) {
                case 1: registrarEstudiante(); break;
                case 2: leerEstudiantes(); break;
                case 3:
                    System.out.println("\nSaliendo del programa...\n");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo\n");
            }
        }while (opcion!=3);
    }
}
