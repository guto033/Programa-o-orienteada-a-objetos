import java.util.ArrayList;
import java.util.List;

public class Despacho {
    private final List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public double calcularCustoTotal(double km) {
        double total = 0;
        for (Veiculo v : veiculos) {
            total += v.calcularCusto(km);
        }
        return total;
    }

    public void imprimirRelatorio(double km) {
    for (Veiculo v : veiculos) {
        System.out.println(v.getPlaca() + ": R$ " + v.calcularCusto(km));
    }
    System.out.println("Total: R$ " + calcularCustoTotal(km));
}
