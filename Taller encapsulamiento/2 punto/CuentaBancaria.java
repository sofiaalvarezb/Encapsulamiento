//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 2 Taller encapsulamiento - Cuenta Bancaria
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public CuentaBancaria(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
  }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;}
    }
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;}
    }
    public double consultarSaldo() {
        return saldo;
    }
}
