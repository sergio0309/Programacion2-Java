package ProyectoNombre;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GestorArchivo {
    private String rutaArchivo;

    public  GestorArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    //metodo escriba los datos del estudiante al final
    public boolean guardarEstudiantes(Estudiante estudiante) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo, true))){
            writer.println(estudiante);
            return true;
        } catch (Exception e){
           return  false;
        }
    }
    // Metodo para leer toda las lineas
    public List<String> obtenerRegistros(){
        List<String> lineas = new ArrayList<>(); //crea lista dinamica
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()){
            return lineas;
        }
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error al leer el archivo");
        }
        return lineas;
    }
    public  boolean existeArchivo(){
        return new File(rutaArchivo).exists();
    }
}