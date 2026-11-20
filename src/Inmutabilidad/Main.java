package Inmutabilidad;

public class Main {
    public static void main(String[] args) {
        Casa Micasa = new Casa(3,3,200);
        System.out.println("Mi casa tiene "+Micasa.getPuertas()+" puertas");
        System.out.println("Mi casa tiene "+Micasa.getVentanas()+" ventanas");
        System.out.println("Mica casa mide "+Micasa.getMedidas()+" metros");
    }
}
