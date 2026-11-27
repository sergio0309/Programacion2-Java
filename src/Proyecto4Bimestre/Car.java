package Proyecto4Bimestre;

public class Car extends Vehicle{
    private CarType carType;

    public Car(String brand, String model, int year, CarType carType) {
        super(brand, model, year);
        this.carType = carType;
    }

    @Override
    public void star() {
        System.out.println("El auto Arranco..");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}'+ super.toString();
    }
}
