package Conta_Bancária;
import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> contas;
    private int proximoNumero;

    public Banco() {
        contas = new ArrayList<>();
        proximoNumero = 1;
    }

    public ContaBancaria abrirConta(String titular, String cpf, String dataNascimento) {

        ContaBancaria conta = new ContaBancaria(
                proximoNumero,
                titular,
                cpf,
                dataNascimento,
                0
        );

        contas.add(conta);
        proximoNumero++;

        System.out.println("Conta criada com sucesso.");
        System.out.println("Número da conta: " + conta.getNumero());

        return conta;
    }

    public ContaBancaria buscarConta(int numero) {

        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }

        return null;
    }

    public void depositar(int numero, double valor) {

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            conta.depositar(valor);
        }
    }

    public void sacar(int numero, double valor) {

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            conta.sacar(valor);
        }
    }

    public void consultarSaldo(int numero) {

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }

    public void exibirExtrato(int numero) {

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            conta.exibirExtrato();
        }
    }

    public void aplicarRendimento(int numero, double percentual) {

        ContaBancaria conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            conta.aplicarRendimento(percentual);
        }
    }

    public void listarContas() {

        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (ContaBancaria conta : contas) {
            System.out.println(
                    "Conta: " + conta.getNumero()
                            + " | Titular: " + conta.getTitular()
                            + " | Saldo: " + conta.getSaldo()
            );
        }
    }

    public void transferir(int origem, int destino, double valor) {

        if (origem == destino) {
            System.out.println("Não é possível transferir para a mesma conta.");
            return;
        }

        ContaBancaria contaOrigem = buscarConta(origem);
        ContaBancaria contaDestino = buscarConta(destino);

        if (contaOrigem == null || contaDestino == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > contaOrigem.getSaldo()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }
}