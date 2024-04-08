//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 4 Taller encapsulamiento - Main
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fechaContratacion = new Date();
        Empleado empleado = new Empleado("Juan", 2000.0, fechaContratacion);
        System.out.println("Información del empleado:");
        empleado.obtenerInformacion();

        empleado.aumentarSalario(500.0);
        System.out.println("\nInformación actualizada del empleado:");
        empleado.obtenerInformacion();
    }
}
