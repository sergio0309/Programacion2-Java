package Vehiculo;

public class Auto extends Vehiculo{
    private int puertas;

    public Auto(String marca, String modelo, int anio, int puertas) {
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    public void abrirPuertas(){
        System.out.println("Puertas abiertas!!");
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "puertas=" + puertas +
                '}' + super.toString();
    }
}
