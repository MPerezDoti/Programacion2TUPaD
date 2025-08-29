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

        System.out.println("\n===== EJERCICIO 5 - Condicionales =====");
        ejercicio5_Condicionales(sc);

        System.out.println("\n===== EJERCICIO 6 - Bucles =====");
        ejercicio6_Bucles();

        System.out.println("\n===== EJERCICIO 7 - Arreglos =====");
        ejercicio7_Arreglos();

        System.out.println("\n===== EJERCICIO 8 - Funciones =====");
        ejercicio8_Funciones();

        System.out.println("\n===== EJERCICIO 9 - POO =====");
        ejercicio9_POO();

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
        sc.nextLine(); // limpiar buffer

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }

    // Ejercicio 5 - Condicionales
    static void ejercicio5_Condicionales(Scanner sc) {
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    // Ejercicio 6 - Bucles
    static void ejercicio6_Bucles() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
    }

    // Ejercicio 7 - Arreglos
    static void ejercicio7_Arreglos() {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Elementos del arreglo:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    // Ejercicio 8 - Funciones
    static void ejercicio8_Funciones() {
        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 + 7 es: " + resultado);
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    // Ejercicio 9 - POO
    static void ejercicio9_POO() {
        Persona persona = new Persona("Martín", 24);
        persona.presentarse();
    }

    static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        void presentarse() {
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        }
    }
}
