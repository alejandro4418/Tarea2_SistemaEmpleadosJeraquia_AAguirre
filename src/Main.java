//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EmpleadoPorHora empHora1 = new EmpleadoPorHora("Carlos", 101, 160, 15.5);
    EmpleadoPorHora empHora2 = new EmpleadoPorHora("Ana", 102, 140, 18.0);

    EmpleadoFijo empFijo1 = new EmpleadoFijo("Luis", 201, 160, 2500);
    EmpleadoFijo empFijo2 = new EmpleadoFijo("Marta", 202, 160, 3000);

    EmpleadoComision empComision1 = new EmpleadoComision("Pedro", 301, 160, 1500, 10, 20000);
    EmpleadoComision empComision2 = new EmpleadoComision("Lucía", 302, 160, 1800, 12, 25000);

    // Arreglo de tipo Empleado[]
    Empleado[] empleados = {empHora1, empHora2, empFijo1, empFijo2, empComision1, empComision2};

    // Recorrer y mostrar info + bono si aplica
    for (Empleado e : empleados) {
        e.mostrarInfo();
        if (e instanceof Bonificable b) {  // Java 16+ pattern matching
            System.out.println("Bono: $" + b.calcularBono());
        }
        System.out.println("------------------------");
    }
}
