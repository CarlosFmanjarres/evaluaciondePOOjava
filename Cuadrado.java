package main.java.package1.src;

public class Cuadrado extends FiguraGeometrica {
    // Constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    // Implementación de los métodos de la clase padre
    @Override
    public double calcularArea() {
        return alto * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * alto;
    }

    @Override
    public double calcularHipotenusa() {
        return Math.sqrt(2) * alto;
    }
}


