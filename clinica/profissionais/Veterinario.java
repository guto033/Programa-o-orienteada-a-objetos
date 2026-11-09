package clinica.profissionais;

import clinica.capacidades.AplicaVacina;
import clinica.capacidades.FazConsulta;
import clinica.capacidades.RealizaCirurgia;

public class Veterinario extends Funcionario implements FazConsulta, AplicaVacina, RealizaCirurgia {
    public Veterinario(String nome) {
        super(nome);
    }

    @Override
    public void consultar(String animal) {
        System.out.println("[Vet " + getNome() + "] Consultando " + animal);
    }

    @Override
    public void vacinar(String animal) {
        System.out.println("[Vet " + getNome() + "] Vacinando " + animal);
    }

    @Override
    public void operar(String animal) {
        System.out.println("[Vet " + getNome() + "] Operando " + animal);
    }
}
