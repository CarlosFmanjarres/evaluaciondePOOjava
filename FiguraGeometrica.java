package main.java.package1.src;

public class FiguraGeometrica {
    protected double alto;
    protected double ancho;

    // Constructor
    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    // Métodos para calcular área, perímetro e hipotenusa (en el caso de rectángulo)
    public double calcularArea() {
        return 0; // No se define en la clase padre
    }

    public double calcularPerimetro() {
        return 0; // No se define en la clase padre
    }

    public double calcularHipotenusa() {
        return 0; // No se define en la clase padre
    }
}

