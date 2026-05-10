public class EmpleadoPorHora extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHora(String nombre, int id, double horasTrabajadas, double tarifaHora) {
        super(nombre, id, horasTrabajadas);
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}
