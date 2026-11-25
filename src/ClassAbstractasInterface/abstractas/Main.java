package ClassAbstractasInterface.abstractas;

public class Main {
    public static void main(String[] args) {
        //Empleado emp = new Empleado("Jose", 1000);

        //Clase Anonima
        Empleado emp = new Empleado("Jose", 1000) {
            @Override
            public double calcularSalario() {
                System.out.println("Soy una clase anonima");
                return 0;
            }
        };
        System.out.println(emp.calcularSalario());

        Empleado emp1 = new EmpleadoTiempoCompleto("Mario",1500, 300.0);
        Empleado emp2 = new EmpleadoPorHoras("Jose",80,45.0 );

        emp1.mostrarRecibo();
        emp2.mostrarRecibo();
    }
}
