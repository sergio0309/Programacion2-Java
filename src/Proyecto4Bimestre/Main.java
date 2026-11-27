package Proyecto4Bimestre;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat","Duna", 2023, CarType.SPORT);
        Vehicle myCarElectric = new ElectricCar("Tesla","Modelo 3",2025, CarType.SEDAN,80);
        myCar.star();
        myCarElectric.star();
        ((ElectricCar) myCarElectric).chargeBattery();
        System.out.println(myCar.toString());
        System.out.println(myCarElectric.toString());
    }
}
