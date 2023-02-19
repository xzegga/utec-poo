public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.sqrt(3) / 4 * Math.pow(lado, 2);
    }

    public static void main(String[] args) {
        double lado = 5.0; // Valor del lado del triángulo
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);
        double area = triangulo.calcularArea();
        System.out.println("El área del triángulo equilátero de lado " + lado + " es " + area);
    }
}
