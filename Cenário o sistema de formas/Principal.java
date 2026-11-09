import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Circulo(2.5));
        formas.add(new Retangulo(4, 6));
        formas.add(new Retangulo(10, 3));
        formas.add(new Triangulo(3, 4, 5));
        formas.add(new Triangulo(7, 8, 9));

        for (Forma f : formas) {
            System.out.println(f.getClass().getSimpleName() + " | Área: " + f.calcularArea() + " | Perímetro: " + f.calcularPerimetro());
}