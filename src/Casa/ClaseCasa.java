package Casa;

public class ClaseCasa {
    private int puertas;
    private int  ventanas;
    private double tamanio;

    public ClaseCasa(){}
    public ClaseCasa(int puertas, int ventanas, float tamanio) {
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.tamanio = tamanio;
    }

    public int puertas(){
        return puertas;
    }

    public int ventanas(){
        return ventanas;
    }

    // Getter y Setter
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
