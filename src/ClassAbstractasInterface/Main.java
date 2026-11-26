package ClassAbstractasInterface;

public class Main {
    public static void main(String[] args) {
        Vehiculo elec = new Vehiculo("toyota","drie",2000) {
            @Override
            public void conducir() {
                System.out.println("Conduciendo 123");
            }
        };
        System.out.println("Vehiculo conducido:" + elec.toString());
        elec.conducir();
        System.out.println("############################");
        Vehiculo electrico = new AutoElectrico("Fiat", "Duna",2017, 90);
        System.out.println("Vehiculo Electrico: " + electrico.toString());

        System.out.println("############################");
        Vehiculo electrico1 = new AutoElectrico("Camaro","modelo1",2027,Color.BLANCO,EstadoVehiculo.EN_TALLER, 90);
        System.out.println("Vehiculo Electrico1: " + electrico1.toString());
    }
}
