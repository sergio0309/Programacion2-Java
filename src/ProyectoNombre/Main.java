package ProyectoNombre;

public class Main {
    public static void main(String[] args) {
        SistemaEstudiantil sistema = new SistemaEstudiantil("estudiantes.txt");
        sistema.iniciar();
    }
}
