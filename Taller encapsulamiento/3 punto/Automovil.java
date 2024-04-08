//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 3 Taller encapsulamiento - Automovil
public class Automovil {
    private String modelo;
    private String marca;
    private int velocidadActual;
    public Automovil(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadActual = 0;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void acelerar(int aumentoVelocidad) {
        if (aumentoVelocidad > 0) {
            velocidadActual += aumentoVelocidad;
        }
    }
    public void frenar(int reduccionVelocidad) {
        if (reduccionVelocidad > 0 && velocidadActual >= reduccionVelocidad) {
            velocidadActual -= reduccionVelocidad;
        } else if (velocidadActual > 0) {
            velocidadActual = 0;
        }
    }
}
