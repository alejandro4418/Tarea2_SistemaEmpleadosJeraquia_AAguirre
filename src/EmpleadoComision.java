public class EmpleadoComision extends Empleado implements Bonificable {
    private double salarioBase;
    private double porcentajeVentas;
    private double montoVentas;

    public EmpleadoComision(String nombre, int id, double horasTrabajadas,
                            double salarioBase, double porcentajeVentas, double montoVentas) {
        super(nombre, id, horasTrabajadas);
        this.salarioBase = salarioBase;
        this.porcentajeVentas = porcentajeVentas;
        this.montoVentas = montoVentas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (montoVentas * porcentajeVentas / 100);
    }

    @Override
    public double calcularBono() {
        return montoVentas * 0.05;  // 5% de las ventas
    }
}
