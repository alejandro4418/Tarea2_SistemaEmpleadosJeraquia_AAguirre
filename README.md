=================================================
TAREA 2 - SISTEMA DE EMPLEADOS CON JERARQUÍA
=================================================

AUTOR: Alejandro Aguirre
FECHA: 10-05-2026
ASIGNATURA: Programación Orientada a Objetos

=================================================
DECISIONES DE DISEÑO
=================================================

1. ¿Por qué Empleado es una clase abstracta?
-------------------------------------------------
Empleado es abstracta porque no tiene sentido instanciar
un "empleado genérico". Un empleado debe ser de un tipo
específico: por hora, fijo o por comisión. La clase
abstracta sirve como molde base que define la estructura
común (nombre, id, horasTrabajadas) y obliga a las
subclases a implementar calcularSalario().

2. ¿Por qué se usó protected en los atributos?
-------------------------------------------------
El PDF del curso (página 4) indica que usar private en
atributos que las subclases necesitan es un "ERROR FRECUENTE".
La solución recomendada es usar protected, que permite
acceso desde la clase padre y todas sus subclases.

3. ¿Por qué calcularSalario() es un método abstracto?
-------------------------------------------------
Porque cada tipo de empleado calcula su salario de forma diferente:
- Por hora: horasTrabajadas × tarifaHora
- Fijo: salarioBase (sin importar horas)
- Comisión: salarioBase + (ventas × porcentaje / 100)

No hay una fórmula genérica, por eso se declara abstracto
y cada subclase lo implementa a su manera.

4. ¿Por qué EmpleadoFijo y EmpleadoComision implementan Bonificable?
-------------------------------------------------
Porque son los únicos tipos de empleado que reciben bono
según el enunciado. EmpleadoPorHora NO implementa la interfaz,
lo que es correcto porque no tiene método calcularBono().

Esto demuestra el principio de "Segregación de Interfaces": 
interfaces pequeñas y específicas en lugar de una interfaz gigante 
con métodos que no todos usan.

5. ¿Por qué se usa instanceof en el main?
-------------------------------------------------
Para identificar en tiempo de ejecución qué empleados son
bonificables. El arreglo es de tipo Empleado[] (polimorfismo),
pero solo EmpleadoFijo y EmpleadoComision tienen bono.

instanceof permite preguntar: "¿este objeto implementa
Bonificable?" Si es verdad, se llama a calcularBono().

=================================================
ESTRUCTURA DEL PROYECTO
=================================================

Archivo               | Descripción
----------------------|-------------------------------------------
Empleado.java         | Clase abstracta base (padre)
EmpleadoPorHora.java  | Subclase - salario por horas trabajadas
EmpleadoFijo.java     | Subclase - salario fijo + implementa Bono
EmpleadoComision.java | Subclase - salario base + comisión + Bono
Bonificable.java      | Interfaz con método calcularBono()
Main.java             | Clase principal con método main()

=================================================
FÓRMULAS UTILIZADAS
=================================================

Tipo de Empleado    | Fórmula del Salario              | Bono
--------------------|----------------------------------|-------------------
Por Hora            | horasTrabajadas × tarifaHora     | No tiene
Fijo                | salarioBase                      | salarioBase × 0.10
Comisión            | salarioBase + (montoVentas ×     | montoVentas × 0.05
                    | porcentajeVentas / 100)          |

=================================================
CÓMO COMPILAR Y EJECUTAR
=================================================

1. Abrir el proyecto en IntelliJ IDEA
2. Asegurar que todos los .java están en la carpeta src/
3. Ejecutar Main.java (click derecho -> Run 'Main')
4. El programa mostrará la información de los 6 empleados
   y los bonos de aquellos que son bonificables

=================================================
