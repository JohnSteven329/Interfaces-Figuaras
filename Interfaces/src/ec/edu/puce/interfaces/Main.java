package ec.edu.puce.interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola PUCE");

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(26);
        rectangulo.setAltura(75);
        System.out.println("Area del rectangulo es: " + rectangulo.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(10);
        System.out.println("Area del circulo es: " + circulo.calcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(10);
        triangulo.setAltura(15);
        System.out.println("Area del triangulo es: " + triangulo.calcularArea());
    }
}
