
import clinica.capacidades.AgendaConsulta;
import clinica.capacidades.EmiteRecibo;

public class Recepcionista extends Funcionario implements AgendaConsulta, EmiteRecibo {
    public Recepcionista(String nome) {
        super(nome);
    }

    @Override
    public void agendarConsulta(String animal, String horario) {
        System.out.println("[Recepção " + getNome() + "] Consulta de " + animal + " agendada para " + horario);
    }

    @Override
    public void emitirRecibo(String animal, double valor) {
        System.out.printf("[Recepção %s] Recibo de %s: R$ %.2f%n", getNome(), animal, valor);
    }
}
