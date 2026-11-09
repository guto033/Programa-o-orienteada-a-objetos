
import clinica.capacidades.AgendaConsulta;
import clinica.capacidades.DaBanho;

public class Estagiario extends Funcionario implements AgendaConsulta, DaBanho {
    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public void agendarConsulta(String animal, String horario) {
        System.out.println("[Estagiário " + getNome() + "] Consulta de " + animal + " agendada para " + horario);
    }

    @Override
    public void darBanho(String animal) {
        System.out.println("[Estagiário " + getNome() + "] Dando banho em " + animal);
    }
}
