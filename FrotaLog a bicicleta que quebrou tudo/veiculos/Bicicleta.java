public class Bicicleta extends Veiculo {
    public static final double LIMITE_KM = 5.0;

    public Bicicleta(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public boolean atende(double km) {
        return km <= LIMITE_KM;
    }

    @Override
    public double calcularCusto(double km) {
        if (!atende(km)) {
            throw new IllegalArgumentException(
                    "Pré-condição violada: bicicleta só atende até " + LIMITE_KM + " km.");
        }
        return custoBase(km) / 4;
    }
}
