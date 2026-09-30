package POO;

public class Perro {
    // Atributos
    String nombre;
    int edad;
    String genero;

    public Perro() {
        this.nombre = "Sin datos";
        this.edad = 0;
        this.genero = "No definido";
    }
    public Perro(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.genero = "No definido";
    }
    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = "No definido";
    }
    public Perro(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos
    void comer(){
        System.out.println("El perro esta comiendo");
    }
    void dormir(){
        System.out.println("El perro esta durmiendo");
    }
    void saltar(){
        System.out.println("El perro esta saltando");
    }

}
