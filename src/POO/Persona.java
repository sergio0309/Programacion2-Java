package POO;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public void datos(){
        System.out.println("Datos de la persona");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}
