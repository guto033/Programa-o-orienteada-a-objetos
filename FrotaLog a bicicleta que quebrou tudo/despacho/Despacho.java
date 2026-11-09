import frota.veiculos.Veiculo;

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
            if (v.atende(km)) {
                total += v.calcularCusto(km);
            }
        }
        return total;
    }

    public void imprimirRelatorio(double km) {
    System.out.println("Despacho para " + km + " km");
    for (Veiculo v : veiculos) {
        String custo = v.atende(km) ? String.format("R$ %.2f", v.calcularCusto(km)) : "fora do alcance";
        System.out.println(v.getPlaca() + ": " + custo);
    }
    System.out.printf("Custo total: R$ %.2f%n", calcularCustoTotal(km));
}
    }
}
