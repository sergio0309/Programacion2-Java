package ClassAbstractasInterface.abstractas;

//La clase abstracta no puede iniciarce, solo puede heredarse
public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();


    public void mostrarRecibo(){
        System.out.println("Empleado: "+nombre+" | Pago total: Bs"+calcularSalario());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
