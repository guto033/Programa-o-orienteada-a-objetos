
import clinica.capacidades.DaBanho;
import clinica.capacidades.FazTosa;

public class Tosador extends Funcionario implements FazTosa, DaBanho {
    public Tosador(String nome) {
        super(nome);
    }

    @Override
    public void tosar(String animal) {
        System.out.println("[Tosador " + getNome() + "] Tosando " + animal);
    }

    @Override
    public void darBanho(String animal) {
        System.out.println("[Tosador " + getNome() + "] Dando banho em " + animal);
    }
}
