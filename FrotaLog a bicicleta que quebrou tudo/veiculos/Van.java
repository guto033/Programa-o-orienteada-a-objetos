
public class Van extends Veiculo {

    public Van(String placa, double capacidadeKg) {
        super(placa, capacidadeKg);
    }

    @Override
    public double calcularCusto(double km) {
        return custoBase(km);
    }
}
