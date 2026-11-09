public class Triangulo implements Forma {
    private double a, b, c;

    public Triangulo(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Os lados não formam um triângulo.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcularPerimetro() {
        return a + b + c;
    }

    @Override
    public double calcularArea() {
        double p = calcularPerimetro() / 2; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}