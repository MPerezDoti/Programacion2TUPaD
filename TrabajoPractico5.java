// trabajo practico 5: relaciones uml 1 a 1
// se incluyen las clases principales y las relaciones solicitadas de manera simplificada

// ejercicio 1: pasaporte - foto - titular
class Foto {
    String imagen;
    String formato;
    public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
}
class Titular {
    String nombre;
    String dni;
    Pasaporte pasaporte; // asociacion bidireccional
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
}
class Pasaporte {
    String numero;
    String fechaEmision;
    Foto foto; // composicion
    Titular titular;
    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = foto;
    }
    public void setTitular(Titular titular) { this.titular = titular; titular.pasaporte = this; }
}

// ejercicio 2: celular - bateria - usuario
class Bateria {
    String modelo; int capacidad;
    public Bateria(String modelo, int capacidad) { this.modelo = modelo; this.capacidad = capacidad; }
}
class Usuario {
    String nombre; String dni;
    Celular celular;
    public Usuario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
}
class Celular {
    String imei; String marca; String modelo;
    Bateria bateria; // agregacion
    Usuario usuario;
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    public void setUsuario(Usuario u) { this.usuario = u; u.celular = this; }
}

// ejercicio 3: libro - autor - editorial
class Autor {
    String nombre; String nacionalidad;
    public Autor(String n, String na) { nombre = n; nacionalidad = na; }
}
class Editorial {
    String nombre; String direccion;
    public Editorial(String n, String d) { nombre = n; direccion = d; }
}
class Libro {
    String titulo; String isbn;
    Autor autor; Editorial editorial;
    public Libro(String t, String i, Autor a, Editorial e) { titulo=t; isbn=i; autor=a; editorial=e; }
}

// ejercicio 4: tarjeta - cliente - banco
class Cliente {
    String nombre; String dni;
    TarjetaDeCredito tarjeta;
    public Cliente(String n, String d) { nombre=n; dni=d; }
}
class Banco {
    String nombre; String cuit;
    public Banco(String n, String c) { nombre=n; cuit=c; }
}
class TarjetaDeCredito {
    String numero; String fechaVencimiento;
    Cliente cliente; Banco banco;
    public TarjetaDeCredito(String num, String fv, Banco b) { numero=num; fechaVencimiento=fv; banco=b; }
    public void setCliente(Cliente c) { cliente=c; c.tarjeta=this; }
}

// ejercicio 5: computadora - placamadre - propietario
class PlacaMadre {
    String modelo; String chipset;
    public PlacaMadre(String m, String c) { modelo=m; chipset=c; }
}
class Propietario {
    String nombre; String dni;
    Computadora computadora;
    public Propietario(String n, String d) { nombre=n; dni=d; }
}
class Computadora {
    String marca; String numeroSerie;
    PlacaMadre placa; Propietario propietario;
    public Computadora(String m, String ns, PlacaMadre p) { marca=m; numeroSerie=ns; placa=p; }
    public void setPropietario(Propietario p) { propietario=p; p.computadora=this; }
}

// ejercicio 6: reserva - cliente - mesa
class Mesa {
    int numero; int capacidad;
    public Mesa(int n, int c) { numero=n; capacidad=c; }
}
class Reserva {
    String fecha; String hora;
    Cliente cliente; Mesa mesa;
    public Reserva(String f, String h, Cliente c, Mesa m) { fecha=f; hora=h; cliente=c; mesa=m; }
}

// ejercicio 7: vehiculo - motor - conductor
class Motor {
    String tipo; String numeroSerie;
    public Motor(String t, String n) { tipo=t; numeroSerie=n; }
}
class Conductor {
    String nombre; String licencia;
    Vehiculo vehiculo;
    public Conductor(String n, String l) { nombre=n; licencia=l; }
}
class Vehiculo {
    String patente; String modelo;
    Motor motor; Conductor conductor;
    public Vehiculo(String p, String m, Motor mo) { patente=p; modelo=m; motor=mo; }
    public void setConductor(Conductor c) { conductor=c; c.vehiculo=this; }
}

// ejercicio 8: documento - firma digital - usuario
class FirmaDigital {
    String codigoHash; String fecha;
    Usuario usuario; // agregacion
    public FirmaDigital(String ch, String f, Usuario u) { codigoHash=ch; fecha=f; usuario=u; }
}
class Documento {
    String titulo; String contenido;
    FirmaDigital firma; // composicion
    public Documento(String t, String c, FirmaDigital f) { titulo=t; contenido=c; firma=f; }
}

// ejercicio 9: cita medica - paciente - profesional
class Paciente {
    String nombre; String obraSocial;
    public Paciente(String n, String o) { nombre=n; obraSocial=o; }
}
class Profesional {
    String nombre; String especialidad;
    public Profesional(String n, String e) { nombre=n; especialidad=e; }
}
class CitaMedica {
    String fecha; String hora;
    Paciente paciente; Profesional profesional;
    public CitaMedica(String f, String h, Paciente p, Profesional pr) { fecha=f; hora=h; paciente=p; profesional=pr; }
}

// ejercicio 10: cuenta bancaria - clave seguridad - titular
class ClaveSeguridad {
    String codigo; String ultimaModificacion;
    public ClaveSeguridad(String c, String u) { codigo=c; ultimaModificacion=u; }
}
class CuentaBancaria {
    String cbu; double saldo;
    ClaveSeguridad clave; Titular titular;
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) { this.cbu=cbu; this.saldo=saldo; this.clave=clave; }
    public void setTitular(Titular t) { titular=t; t.pasaporte = null; } // ejemplo de bidireccional
}

// ejercicio 11: reproductor - cancion - artista
class Artista {
    String nombre; String genero;
    public Artista(String n, String g) { nombre=n; genero=g; }
}
class Cancion {
    String titulo; Artista artista;
    public Cancion(String t, Artista a) { titulo=t; artista=a; }
}
class Reproductor {
    public void reproducir(Cancion c) { System.out.println("reproduciendo: " + c.titulo + " de " + c.artista.nombre); }
}

// ejercicio 12: impuesto - contribuyente - calculadora
class Contribuyente {
    String nombre; String cuil;
    public Contribuyente(String n, String c) { nombre=n; cuil=c; }
}
class Impuesto {
    double monto; Contribuyente contribuyente;
    public Impuesto(double m, Contribuyente c) { monto=m; contribuyente=c; }
}
class Calculadora {
    public void calcular(Impuesto i) { System.out.println("impuesto de " + i.contribuyente.nombre + ": " + i.monto); }
}

// ejercicio 13: generador qr - usuario - codigo qr
class CodigoQR {
    String valor; Usuario usuario;
    public CodigoQR(String v, Usuario u) { valor=v; usuario=u; }
}
class GeneradorQR {
    public void generar(String valor, Usuario u) {
        CodigoQR qr = new CodigoQR(valor,u);
        System.out.println("codigo generado para " + u.nombre + ": " + qr.valor);
    }
}

// ejercicio 14: editor video - proyecto - render
class Proyecto {
    String nombre; int duracionMin;
    public Proyecto(String n, int d) { nombre=n; duracionMin=d; }
}
class Render {
    String formato; Proyecto proyecto;
    public Render(String f, Proyecto p) { formato=f; proyecto=p; }
}
class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);
        System.out.println("exportando proyecto " + proyecto.nombre + " en formato " + r.formato);
    }
}

// clase main de prueba
public class TrabajoPractico5 {
    public static void main(String[] args) {
        // se crean algunos objetos para demostrar las relaciones
        Artista artista = new Artista("queen","rock");
        Cancion cancion = new Cancion("bohemian rhapsody", artista);
        Reproductor rep = new Reproductor();
        rep.reproducir(cancion);

        Contribuyente cont = new Contribuyente("juan","20-12345678-9");
        Impuesto imp = new Impuesto(1500, cont);
        new Calculadora().calcular(imp);

        Usuario user = new Usuario("maria","123");
        new GeneradorQR().generar("ABC123", user);

        Proyecto proy = new Proyecto("video promo", 5);
        new EditorVideo().exportar("mp4", proy);
    }
}
