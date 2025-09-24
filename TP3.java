import java.util.Scanner;
// resuelto utilizando switch case para testeo mas sencillo y seleccion de ejecucion.
// ejercicio 1
// registro de estudiantes
// crear una clase estudiante con los atributos: nombre, apellido, curso, calificacion
// metodos requeridos: mostrarinfo(), subircalificacion(puntos), bajarcalificacion(puntos)
// tarea: instanciar a un estudiante, mostrar su informacion, aumentar y disminuir calificaciones
class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    void mostrarInfo() {
        System.out.println("nombre: " + nombre + ", apellido: " + apellido + ", curso: " + curso + ", calificacion: " + calificacion);
    }

    void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}

// ejercicio 2
// registro de mascotas
// crear una clase mascota con los atributos: nombre, especie, edad
// metodos requeridos: mostrarinfo(), cumpliranios()
// tarea: crear una mascota, mostrar su informacion, simular el paso del tiempo y verificar los cambios
class Mascota {
    String nombre;
    String especie;
    int edad;

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarInfo() {
        System.out.println("nombre: " + nombre + ", especie: " + especie + ", edad: " + edad);
    }

    void cumplirAnios() {
        edad++;
    }
}

// ejercicio 3
// encapsulamiento con la clase libro
// crear una clase libro con atributos privados: titulo, autor, anopublicacion
// metodos requeridos: getters para todos los atributos. setter con validacion para anopublicacion
// tarea: crear un libro, intentar modificar el año con un valor invalido y luego con uno valido, mostrar la informacion final
class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnoPublicacion(anoPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacion() { return anoPublicacion; }

    public void setAnoPublicacion(int ano) {
        if (ano > 0 && ano <= 2025) {
            this.anoPublicacion = ano;
        } else {
            System.out.println("año invalido, no se pudo actualizar");
        }
    }
}

// ejercicio 4
// gestion de gallinas en granja digital
// crear una clase gallina con los atributos: idgallina, edad, huevospuestos
// metodos requeridos: ponerhuevo(), envejecer(), mostrarestado()
// tarea: crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado
class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;

    Gallina(String idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    void ponerHuevo() { huevosPuestos++; }
    void envejecer() { edad++; }
    void mostrarEstado() {
        System.out.println("gallina " + idGallina + " edad: " + edad + " huevos: " + huevosPuestos);
    }
}

// ejercicio 5
// simulacion de nave espacial
// crear una clase naveespacial con los atributos: nombre, combustible
// metodos requeridos: despegar(), avanzar(distancia), recargarcombustible(cantidad), mostrarestado()
// reglas: validar que haya suficiente combustible antes de avanzar y evitar que se supere el limite al recargar
// tarea: crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. mostrar el estado al final
class NaveEspacial {
    String nombre;
    double combustible;
    double limite = 100;

    NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    void despegar() {
        System.out.println(nombre + " ha despegado");
    }

    void avanzar(double distancia) {
        double consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " unidades");
        } else {
            System.out.println("combustible insuficiente para avanzar");
        }
    }

    void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= limite) {
            combustible += cantidad;
        } else {
            System.out.println("no se puede superar el limite de combustible");
        }
    }

    void mostrarEstado() {
        System.out.println("nave " + nombre + " combustible: " + combustible);
    }
}

public class TP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu principal");
        System.out.println("1 - ejercicio estudiante");
        System.out.println("2 - ejercicio mascota");
        System.out.println("3 - ejercicio libro");
        System.out.println("4 - ejercicio gallina");
        System.out.println("5 - ejercicio nave espacial");
        System.out.print("seleccione una opcion: ");
        int opcion = sc.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                Estudiante e = new Estudiante("juan","perez","programacion",7.5);
                e.mostrarInfo();
                e.subirCalificacion(1.5);
                e.mostrarInfo();
                e.bajarCalificacion(0.5);
                e.mostrarInfo();
                break;
            case 2:
                Mascota m = new Mascota("firulais","perro",3);
                m.mostrarInfo();
                m.cumplirAnios();
                m.mostrarInfo();
                break;
            case 3:
                Libro l = new Libro("Don Quijote de la Mancha","Miguel de Cervantes",1605);
                l.setAnoPublicacion(-10);
                l.setAnoPublicacion(2020);
                System.out.println("titulo: " + l.getTitulo() + ", autor: " + l.getAutor() + ", año: " + l.getAnoPublicacion());
                break;
            case 4:
                Gallina g1 = new Gallina("g1");
                Gallina g2 = new Gallina("g2");
                g1.envejecer();
                g1.ponerHuevo();
                g2.envejecer();
                g2.envejecer();
                g2.ponerHuevo();
                g2.ponerHuevo();
                g1.mostrarEstado();
                g2.mostrarEstado();
                break;
            case 5:
                NaveEspacial n = new NaveEspacial("Apollo",50);
                n.despegar();
                n.avanzar(20);
                n.recargarCombustible(30);
                n.avanzar(20);
                n.mostrarEstado();
                break;
            default:
                System.out.println("opcion invalida");
        }
        sc.close();
    }
}
