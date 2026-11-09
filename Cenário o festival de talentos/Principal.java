import festival.apresentacao.*;
import festival.programacao.Programacao;

public class Main {
    public static void main(String[] args) {
        Programacao programacao = new Programacao();

        programacao.registrar(new Cantor("Ana", "9A", "Evidências", 4));
        programacao.registrar(new Dancarino("Bruno", "8B", "Hip-hop", 5));
        programacao.registrar(new Comediante("Carla", "9C", "vida escolar", 3));

        programacao.listar();
        System.out.println("\nDuração total do festival: "
                + programacao.calcularDuracaoTotal() + " minutos");
    }
}