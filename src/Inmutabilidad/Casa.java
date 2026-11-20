package Inmutabilidad;
//Clase inmutable
public final class Casa {
    private final int puertas;
    private final int ventanas;
    private final double medidas;

    public Casa(int puertas, int ventanas, double medidas) {
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.medidas = medidas;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public double getMedidas() {
        return medidas;
    }
}
