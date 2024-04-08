//Angela Sofia Alvarez Becerra
//08-04-2024
//Punto 5 Taller encapsulamiento - Circulo
public class Circulo {
    private double radio;
    private double area;
    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
        calcularArea();
    }
    private void calcularArea() {
        this.area = Math.PI * Math.pow(radio, 2);
    }
    public double getArea() {
        return area;
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());
        circulo.setRadio(7.0);
        System.out.println("Nuevo radio del círculo: " + circulo.getRadio());
        System.out.println("Nuevo área del círculo: " + circulo.getArea());
    }
}
