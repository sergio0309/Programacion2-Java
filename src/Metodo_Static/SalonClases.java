package Metodo_Static;
//      Atributos estaticos VS Atributos de instancia
public class SalonClases {
    //Atributos
    private String estudiante;      // Atributo instaancia
    private static String colegio = "Suipacha";  // Atributo estatico

    public SalonClases(String estudiante) {
        this.estudiante = estudiante;
    }

    public void verInformacion(){
        System.out.println("Estudiante: "+estudiante+" | Colegio: "+colegio);
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public static String getColegio() {
        return colegio;
    }

    public static void setColegio(String colegio) {
        SalonClases.colegio = colegio;
    }
}
