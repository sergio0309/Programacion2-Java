package Metodo_Static;

public class SalonClasesMain {
    public static void main(String[] args) {
        SalonClases estudiante1 = new SalonClases("Pablo FLores");
        SalonClases estudiante2 = new SalonClases("Rodrigo Rejas");

        estudiante1.verInformacion();
        estudiante2.verInformacion();

        SalonClases.setColegio("Junin");//Cambia el atributo static para todas las clases
        /*
        estudiante1.setEstudiante("Jose");
        estudiante1.setColegio("hola");
        */

        estudiante1.verInformacion();
        estudiante2.verInformacion();
    }
}
