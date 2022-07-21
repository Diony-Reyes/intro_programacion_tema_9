public class Main {
    public static void main(String[] args) {
        getClienteInfo();
        System.out.println();
        getTrabajadorInfo();
    }
    public static void getClienteInfo() {
        Cliente cliente = new Cliente();
        cliente.edad = 35;
        cliente.telefono = "+18092389321";
        cliente.nombre = "Carlos";
        cliente.credito = 5450.5;

        System.out.println("Informacion del cliente");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);
    }
    public static void getTrabajadorInfo() {
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.telefono = "+18496844804";
        trabajador.nombre = "Yndrina";
        trabajador.salario = 5000;

        System.out.println("Informacion del trabajador");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Credito: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}