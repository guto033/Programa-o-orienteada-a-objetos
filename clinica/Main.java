package clinica;

import clinica.capacidades.DaBanho;
import clinica.profissionais.Estagiario;
import clinica.profissionais.Recepcionista;
import clinica.profissionais.Tosador;
import clinica.profissionais.Veterinario;

public class Main {
    public static void main(String[] args) {
        Veterinario vet = new Veterinario("Marina");
        Tosador tosador = new Tosador("Rafael");
        Recepcionista recepcionista = new Recepcionista("Lúcia");
        Estagiario estagiario = new Estagiario("Pedro");

        vet.consultar("Thor");
        vet.vacinar("Thor");
        vet.operar("Mel");

        tosador.tosar("Bidu");
        tosador.darBanho("Bidu");

        recepcionista.agendarConsulta("Luna", "15h");
        recepcionista.emitirRecibo("Thor", 180.00);

        estagiario.agendarConsulta("Nina", "16h30");
        estagiario.darBanho("Nina");

        // Quem precisa de banho pede só o contrato DaBanho: aceita tosador e estagiário.
        System.out.println();
        DaBanho[] quemDaBanho = { tosador, estagiario };
        for (DaBanho b : quemDaBanho) {
            b.darBanho("Pipoca");
        }
    }
}
