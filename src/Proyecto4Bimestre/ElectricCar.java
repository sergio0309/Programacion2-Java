package Proyecto4Bimestre;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType carType, int batteryLevel) {
        super(brand, model, year, carType);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void star() {
        System.out.println("El auto electrico esta encendido.");
    }

    @Override
    public void chargeBattery() {

        System.out.println("La bateria esta cargada al "+ batteryLevel+" %");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}'+ super.toString();
    }
}
