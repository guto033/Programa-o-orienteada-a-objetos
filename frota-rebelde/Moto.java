public class Moto extends Veiculo {

    public Moto(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public double calcularCusto(double km) {
        return custoBase(km) / 2;
    }
}
