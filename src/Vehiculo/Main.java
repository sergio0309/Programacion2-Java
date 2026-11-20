package Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota","Chacaritos",2026,4);
        Vehiculo moto = new Motocicleta("Harbey", "Modulo1", 2000, true);

        //Llamar al medoto de encender/apagar desde auto heredado del padre(Vehiculo)
        System.out.println("El auto "+auto.getModelo()+": ");
        auto.encender();                    //Metodo heredado
        auto.apagar();                      //Metodo heredado
        ((Auto) auto).abrirPuertas();       //Metodo Propio
        System.out.println("El moto "+moto.getModelo()+": ");
        moto.encender();                    //Metodo heredado
        moto.apagar();                      //Metodo heredado
        ((Motocicleta) moto).encenderLuz(); //Metodo Propio
        System.out.println("\nSOBRECARGA");
        moto.encender(false);
        //moto.encender();
        System.out.println("\nPOLIMORFISMO DE INCLUSION");
        printVehiculo(moto);
        printVehiculo(auto);
    }

    public static void printVehiculo(Vehiculo vehiculo) {
        System.out.println("toString(): "+vehiculo.toString());
    }
}
