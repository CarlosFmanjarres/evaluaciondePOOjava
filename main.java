package main.java.package1.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Crear matrices para almacenar los resultados
    double[][] resultadosRectangulo = new double[3][3];
    double[][] resultadosCuadrado = new double[3][3];

    // Menú
    int opcion;
    do {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        System.out.println("3. Calcular hipotenusa ");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("\nIngrese el alto: ");
                double alto = scanner.nextDouble();
                System.out.print("Ingrese el ancho: ");
                double ancho = scanner.nextDouble();

                Rectangulo rect = new Rectangulo(alto, ancho);
                resultadosRectangulo[0][0] = rect.calcularArea();
                Cuadrado cua = new Cuadrado (alto);
                resultadosCuadrado[0][0] = cua.calcularArea();
                System.out.println("Área del rectángulo: " + resultadosRectangulo[0][0]);
                System.out.println("Área del cuadrado: " + resultadosCuadrado[0][0]);
                break;
            case 2:
                System.out.print("\nIngrese el alto: ");
                alto = scanner.nextDouble();
                System.out.print("Ingrese el ancho: ");
                ancho = scanner.nextDouble();

                rect = new Rectangulo(alto, ancho);
                resultadosRectangulo[1][0] = rect.calcularPerimetro();
                cua = new Cuadrado(alto);
                resultadosCuadrado[1][0] = cua.calcularPerimetro();
                System.out.println("Perímetro del rectángulo: " + resultadosRectangulo[1][0]);
                System.out.println("Perímetro del cuadrado: " + resultadosCuadrado[1][0]);
                break;
            case 3:
                System.out.print("\nIngrese el alto: ");
                alto = scanner.nextDouble();
                System.out.print("Ingrese el ancho: ");
                ancho = scanner.nextDouble();

                rect = new Rectangulo(alto, ancho);
                resultadosRectangulo[2][0] = rect.calcularHipotenusa();
                cua = new Cuadrado(alto);
                resultadosCuadrado [2][0] = rect.calcularHipotenusa();
                System.out.println("Hipotenusa del rectángulo: " + resultadosRectangulo[2][0]);
                System.out.println("Hipotenusa del cuadrado: (error:los cuadrados no tienen hipotenusa ya que es propiedad de los triangulos rectangulos)");
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    } while (opcion != 4);

    scanner.close();
}
}
