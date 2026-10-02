package ProyectoNombre;

public class Estudiante {
    // Declarar atributos
    private String nombre;  // Almacenar el nombre completo
    private int edad;       // Alcamenra la edad en valor numerico
    private String carrera;  //

    //Metodo constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    //Metodo selector
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCarrera() {
        return carrera;
    }

    //Sobreescritura del metodo
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Carrera: " + carrera;
    }
}
