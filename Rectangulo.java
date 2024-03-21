package main.java.package1.src;

public class Rectangulo extends FiguraGeometrica {
    // Constructor
    public Rectangulo(double alto, double ancho) {
        super(alto, ancho);
    }

    // Implementación de los métodos de la clase padre
    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (alto + ancho);
    }

    @Override
    public double calcularHipotenusa() {
        return Math.sqrt(alto*alto + ancho*ancho);
    }
}

