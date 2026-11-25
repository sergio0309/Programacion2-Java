package ClassAbstractasInterface;

public class AutoElectrico extends Vehiculo implements Electrico, PilotoAutomatico{
    private int nivelBateria;

    public AutoElectrico(String marca, String modelo, int anio, int nivelBateria) {
        super(marca, modelo, anio);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void conducir() {
        System.out.println("El auto esta en marcha");
    }

    @Override
    public void cargarBateria() {
        nivelBateria = MAXIMA_CAPACIDAD_BATERIA;
        System.out.println("El auto esta con el" +nivelBateria+"% de bateria");
    }

    @Override
    public void cargarPilotoAutomatico() {
        System.out.println("El auto esta en piloto automatico");
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "\nMarca=" + getMarca() +
                "\nModelo=" + getModelo() +
                "\nAnio=" + getAnio() +
                "\nnivelBateria=" + nivelBateria +
                '}';
    }
}
