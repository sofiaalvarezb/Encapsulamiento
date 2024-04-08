//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 4 Taller encapsulamiento - Empleado
import java.util.Date;
public class Empleado {
    private String nombre;
    private double salario;
    private Date fechaContratacion;
    public Empleado(String nombre, double salario, Date fechaContratacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public Date getFechaContratacion() {
        return fechaContratacion;
    }
    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de contratación: " + fechaContratacion);
    }
}
