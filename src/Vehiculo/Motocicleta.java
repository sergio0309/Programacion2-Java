package Vehiculo;

public class Motocicleta  extends Vehiculo{
    private boolean frenos;

    public Motocicleta(String marca, String modelo, int anio, boolean frenos) {
        super(marca, modelo, anio);
        this.frenos = frenos;
    }

    public void encenderLuz(){
        System.out.println("Luz encendido");
    }
    public void apagarLuz(){
        System.out.println("Luz apagado");
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "frenos=" + frenos +
                '}'+ super.toString();
    }
}
