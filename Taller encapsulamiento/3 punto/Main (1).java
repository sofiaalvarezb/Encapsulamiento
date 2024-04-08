//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 3 Taller encapsulamiento - Main
public class Main {

    public static void main(String[] args) {
        Automovil auto = new Automovil("Camaro", "Chevrolet");

        System.out.println("Modelo: " + auto.getModelo()); // Camaro
        System.out.println("Marca: " + auto.getMarca()); // Chevrolet
        System.out.println("Velocidad actual: " + auto.getVelocidadActual()); // 0

        auto.acelerar(50);
        System.out.println("Velocidad actual después de acelerar: " + auto.getVelocidadActual()); // 50

        auto.frenar(20);
        System.out.println("Velocidad actual después de frenar: " + auto.getVelocidadActual()); // 30

        auto.frenar(100);
        System.out.println("Velocidad actual después de frenar a fondo: " + auto.getVelocidadActual()); // 0
    }
}
