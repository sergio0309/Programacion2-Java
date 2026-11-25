package ClassAbstractasInterface.abstractas;

public class EmpleadoTiempoCompleto extends Empleado{
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return bono + getSalarioBase();
    }
}
