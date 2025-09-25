// trabajo practico 4 de poo
// se incluyen comentarios para señalar los requisitos solicitados por la catedra

public class Empleado {
    // requisito 6: encapsulamiento en los atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // requisito 5: atributo estatico para contar empleados

    // requisito 2: constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id; // requisito 1: uso de this para diferenciar parametros
        this.nombre = nombre; 
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // requisito 2: incrementar contador en constructor
    }

    // requisito 2: constructor sobrecargado que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // requisito 1 y 2: uso de this y asignacion de id automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
        totalEmpleados++;
    }

    // requisito 3: metodo sobrecargado actualizarSalario con porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100); // requisito 1: uso de this
    }

    // ambos metodos del requisito 3 tienen el mismo nombre, la diferencia es que porcentaje es un double y cantidad es int
    // por lo tanto, para asegurarnos de llamar a uno o al otro se le da formato a los numeros segun lo que se busque
    // por ej; 10 es int, 10.0 es double

    // requisito 3: metodo sobrecargado actualizarSalario con cantidad fija
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad; // requisito 1
    }

    // requisito 4: metodo toString
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
    }

    // requisito 5: metodo estatico para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // requisito 6: getters y setters
    public int getId() { return id; }
    public String getNombre() {return nombre; }
    public String getPuesto() {return puesto; }
    public double getSalario() {return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}

// clase de prueba solicitada
class PruebaEmpleado {
    public static void main(String[] args) {
        // tarea 2: instanciar varios objetos usando ambos constructores
        Empleado e1 = new Empleado(1, "Juan Perez", "desarrollador", 70000);
        Empleado e2 = new Empleado("Jesica Gomez", "analista");
        Empleado e3 = new Empleado("Jeronimo Pico", "QA");

        // tarea 2: aplicar metodos actualizarSalario
        e1.actualizarSalario(10.0); // porcentaje
        e2.actualizarSalario(5000); // cantidad fija
        e3.actualizarSalario(15.0);

        // tarea 2: imprimir informacion de cada empleado
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // tarea 2: mostrar total de empleados
        System.out.println("total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
