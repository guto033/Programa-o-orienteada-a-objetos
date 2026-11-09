
import festival.apresentacao.Apresentavel;
import java.util.ArrayList;
import java.util.List;

public class Programacao {
    private final List<Apresentavel> apresentacoes = new ArrayList<>();

    public void registrar(Apresentavel apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public void listar() {
        int ordem = 1;
        for (Apresentavel a : apresentacoes) {
            System.out.print(ordem++ + ". ");
            a.apresentar();
        }
    }

    public int calcularDuracaoTotal() {
        int total = 0;
        for (Apresentavel a : apresentacoes) {
            total += a.getDuracaoMinutos();
        }
        return total;
    }
}