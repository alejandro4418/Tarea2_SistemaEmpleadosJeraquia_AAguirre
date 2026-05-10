public class EmpleadoFijo extends Empleado implements Bonificable {
    private double salarioBase;

    public EmpleadoFijo(String nombre, int id, double horasTrabajadas, double salarioBase) {
        super(nombre, id, horasTrabajadas);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public double calcularBono() {
        return salarioBase * 0.10;  // 10% del salario base
    }
}
