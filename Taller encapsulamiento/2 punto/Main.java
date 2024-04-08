//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 2 Taller encapsulamiento - Main
public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(123456, 1000.0);
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo()); 
        cuenta.depositar(500.0);
        System.out.println("Saldo después de depósito: " + cuenta.consultarSaldo()); 
        boolean retiroExitoso = cuenta.retirar(800.0);
        System.out.println("Retiro exitoso: " + retiroExitoso); 
        System.out.println("Saldo después de retiro: " + cuenta.consultarSaldo()); 
        boolean retiroFallido = cuenta.retirar(1000.0);
        System.out.println("Retiro exitoso: " + retiroFallido); 
        System.out.println("Saldo final: " + cuenta.consultarSaldo()); 
    }
}
