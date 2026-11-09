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

    protected double custoBase(double km) {
        return CUSTO_BASE_POR_KM * km;
    }

    public abstract double calcularCusto(double km);
}
