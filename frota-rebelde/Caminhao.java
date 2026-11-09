package frota;

public class Caminhao extends Veiculo {
    private static final double ADICIONAL_POR_KM_POR_TONELADA = 0.50;

    public Caminhao(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public double calcularCusto(double km) {
        double toneladas = getCapacidadeKg() / 1000.0;
        double adicional = ADICIONAL_POR_KM_POR_TONELADA * toneladas * km;
        return custoBase(km) + adicional;
    }
}
