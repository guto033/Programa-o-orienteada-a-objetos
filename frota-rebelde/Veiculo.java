package frota;

public abstract class Veiculo {
    protected static final double CUSTO_BASE_POR_KM = 2.00;

    private final String placa;
    private final double capacidadeKg;

    protected Veiculo(String placa, double capacidadeKg) {
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    // Custo base: R$ 2,00 por km. Subclasses reutilizam e ajustam.
    protected double custoBase(double km) {
        return CUSTO_BASE_POR_KM * km;
    }

    // Cada tipo de veículo define a sua regra de custo.
    public abstract double calcularCusto(double km);
}
