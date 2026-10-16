package Metodo_String;

public class ClassPersona {
    private String nombre;
    private String apellido;

    public ClassPersona() {}

    public ClassPersona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "ClassPersona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
