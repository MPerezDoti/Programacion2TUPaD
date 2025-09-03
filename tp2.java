// trabajo practico 2 - Martin Perez Doti
// DNI: 43150956
// la idea es acceder a todos los ejercicios desde un solo .java
// y para evitar imprimir todos los ejercicios en consola se usa un switch-case

import java.util.Scanner;

public class tp2 {

    static Scanner sc = new Scanner(System.in);
    static double descuentoGlobal = 0.10;

    public static void main(String[] args) {
        System.out.println("menu de ejercicios");
        System.out.println("1. verificacion de año bisiesto");
        System.out.println("2. mayor de tres numeros");
        System.out.println("3. clasificacion de edad");
        System.out.println("4. calculadora de descuento por categoria");
        System.out.println("5. suma de numeros pares");
        System.out.println("6. contador de positivos, negativos y ceros");
        System.out.println("7. validacion de nota");
        System.out.println("8. precio final con impuesto y descuento");
        System.out.println("9. costo de envio y total de compra");
        System.out.println("10. actualizacion de stock");
        System.out.println("11. descuento especial con variable global");
        System.out.println("12. modificacion de array de precios");
        System.out.println("13. impresion recursiva de array");
        System.out.print("elige una opcion: ");
        int opcion = sc.nextInt();

        switch(opcion) {
            case 1: ejercicio1(); break;
            case 2: ejercicio2(); break;
            case 3: ejercicio3(); break;
            case 4: ejercicio4(); break;
            case 5: ejercicio5(); break;
            case 6: ejercicio6(); break;
            case 7: ejercicio7(); break;
            case 8: ejercicio8(); break;
            case 9: ejercicio9(); break;
            case 10: ejercicio10(); break;
            case 11: ejercicio11(); break;
            case 12: ejercicio12(); break;
            case 13: ejercicio13(); break;
            default: System.out.println("opcion invalida");
        }
    }

    static void ejercicio1() {
        System.out.print("ingresa un año: ");
        int año = sc.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("el año " + año + " es bisiesto");
        } else {
            System.out.println("el año " + año + " no es bisiesto");
        }
    }

    static void ejercicio2() {
        System.out.print("ingresa el primer numero: ");
        int a = sc.nextInt();
        System.out.print("ingresa el segundo numero: ");
        int b = sc.nextInt();
        System.out.print("ingresa el tercer numero: ");
        int c = sc.nextInt();
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        System.out.println("el mayor es: " + mayor);
    }

    static void ejercicio3() {
        System.out.print("ingresa tu edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("es un niño");
        } else if (edad < 18) {
            System.out.println("es un adolescente");
        } else if (edad < 60) {
            System.out.println("es un adulto");
        } else {
            System.out.println("es un adulto mayor");
        }
    }

    static void ejercicio4() {
        System.out.print("ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("ingresa la categoria (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        double descuento = 0;
        if (categoria == 'A') descuento = 0.10;
        else if (categoria == 'B') descuento = 0.15;
        else if (categoria == 'C') descuento = 0.20;
        double precioFinal = precio - (precio * descuento);
        System.out.println("descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("precio final: " + precioFinal);
    }

    static void ejercicio5() {
        int suma = 0;
        int numero;
        do {
            System.out.print("ingresa un numero (0 para terminar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0 && numero != 0) suma += numero;
        } while (numero != 0);
        System.out.println("la suma de los numeros pares es: " + suma);
    }

    static void ejercicio6() {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("ingresa el numero " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }
        System.out.println("positivos: " + positivos);
        System.out.println("negativos: " + negativos);
        System.out.println("ceros: " + ceros);
    }

    static void ejercicio7() {
        int nota;
        do {
            System.out.print("ingresa una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("error: nota invalida. intenta nuevamente.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("nota guardada correctamente.");
    }

    static void ejercicio8() {
        System.out.print("ingresa el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("ingresa el impuesto en porcentaje: ");
        double impuesto = sc.nextDouble() / 100;
        System.out.print("ingresa el descuento en porcentaje: ");
        double descuento = sc.nextDouble() / 100;
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        System.out.println("el precio final del producto es: " + precioFinal);
    }

    static void ejercicio9() {
        System.out.print("ingresa el precio del producto: ");
        double precioProducto = sc.nextDouble();
        System.out.print("ingresa el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        System.out.print("ingresa la zona de envio (nacional/internacional): ");
        String zona = sc.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("el costo de envio es: " + costoEnvio);
        System.out.println("el total a pagar es: " + total);
    }

    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("nacional")) return peso * 5;
        else return peso * 10;
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    static void ejercicio10() { //actualizarStock
        System.out.print("ingresa el stock actual: ");
        int stockActual = sc.nextInt();
        System.out.print("ingresa la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();
        System.out.print("ingresa la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("el nuevo stock es: " + nuevoStock);
    }

    static void ejercicio11() {
        System.out.print("ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("el descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("el precio final con descuento es: " + precioFinal);
    }

    static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("precios originales:");
        for (double p : precios) {
            System.out.println("precio: $" + p);
        }
        precios[2] = 129.99;
        System.out.println("precios modificados:");
        for (double p : precios) {
            System.out.println("precio: $" + p);
        }
    }

    static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("precios originales:");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    static void imprimirRecursivo(double[] arr, int indice) {
        if (indice < arr.length) {
            System.out.println("precio: $" + arr[indice]);
            imprimirRecursivo(arr, indice + 1);
        }
    }
}
