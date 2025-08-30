import java.util.Scanner;

public class TP1_MartinPerez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== EJERCICIO 2 - Hola Mundo =====");
        ejercicio2_HolaMundo();

        System.out.println("\n===== EJERCICIO 3 - Variables =====");
        ejercicio3_Variables();

        System.out.println("\n===== EJERCICIO 4 - Entrada de Usuario =====");
        ejercicio4_EntradaUsuario(sc);

        System.out.println("\n===== EJERCICIO 5 - Operaciones =====");
        ejercicio5_Operaciones(sc);

        System.out.println("\n===== EJERCICIO 6 - mostrarDatos =====");
        ejercicio6_mostratDatos();

        System.out.println("\n===== EJERCICIO 8 - Division =====");
        ejercicio8_division();

        System.out.println("\n===== EJERCICIO 9 - Codigo Corregido =====");
        ErrorEjemplo();

         System.out.println("\n===== EJERCICIO 10 - prueba escritorio =====");
        PruebaEscritorio();

        sc.close();
    }

    // Ejercicio 2 - Hola Mundo
    static void ejercicio2_HolaMundo() {
        System.out.println("¡Hola, Java!");
    }

    // Ejercicio 3 - Variables
    static void ejercicio3_Variables() {
        String nombre = "Martín";
        int edad = 24;
        double altura = 1.75;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);
    }

    // Ejercicio 4 - Entrada de usuario
    static void ejercicio4_EntradaUsuario(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }

    // Ejercicio 5 - operaciones
    static void ejercicio5_Operaciones(Scanner sc) {
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int mult = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println("la suma es: " + suma + ", la resta es: " + resta + ", la multiplicacion es: " + mult + ", la division es: " + division + ".");
    }

    // Ejercicio 6 - mostrar datos
    static void ejercicio6_mostratDatos() {
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }

    // Ejercicio 8 - division
    static void ejercicio8_division(Scanner sc) {
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        dividiendo = numero1 / numero2;

        System.out.println("El resultado de la Division es: " + dividiendo);
    }

       // Ejercicio 9 - Código corregido
    static class ErrorEjemplo {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingresa tu nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Hola, " + nombre);
            }
        }
    }

    // Ejercicio 10 - Prueba de escritorio
    static class PruebaEscritorio {
        public static void main(String[] args) {
            int a = 5;
            int b = 2;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado); // Resultado esperado: 2
        }
    }
}
