package ClassAbstractasInterface;

public abstract class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private int anio;

    //Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract void conducir();

    public void encender(boolean modoSilencio){
        if(modoSilencio){
            System.out.println("Encendido en modo silencio.");
        } else {
            System.out.println("Encender vehiculo");
        }
    }

    public void encender(){
        System.out.println("Encender vehiculo");
    }
    public void apagar(){
        System.out.println("Apagando vehiculo");
    }

    //Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        int fechaActual = java.time.Year.now().getValue();
        if(fechaActual < 1890 || anio > fechaActual +1){
            throw new IllegalArgumentException("Año invalido");
        }
        this.anio = anio;
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}