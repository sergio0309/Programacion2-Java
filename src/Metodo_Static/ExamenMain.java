package Metodo_Static;

public class ExamenMain {
    public static void main(String[] args) {
        int suma = Examen.suma(5,3);
        System.out.println("Suma: " + suma);
        Examen res = new Examen();
        System.out.println("Resta: " + res.resta(5,2));
    }
}
