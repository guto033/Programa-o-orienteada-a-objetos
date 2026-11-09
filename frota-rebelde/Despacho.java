package frota;

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
        System.out.printf("Entregas de %.1f km%n", km);
        for (Veiculo v : veiculos) {
            System.out.printf("%-10s %-8s %8.0f kg  ->  R$ %8.2f%n",
                    v.getClass().getSimpleName(), v.getPlaca(),
                    v.getCapacidadeKg(), v.calcularCusto(km));
        }
        System.out.printf("%nCusto total: R$ %.2f%n", calcularCustoTotal(km));
    }
}
