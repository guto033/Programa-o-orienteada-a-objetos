package Conta_Bancária;

import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> contas;
    private int proximoNumero;

    public Banco() {

        contas = new ArrayList<>();
        proximoNumero = 1;
    }

    public ContaBancaria abrirConta(int tipo, String titular, String cpf, String dataNascimento) {

        ContaBancaria conta;

        if (tipo == 1) {
            conta = new ContaCorrente(proximoNumero, titular, cpf, dataNascimento, 0);
        } else {
            conta = new ContaPoupanca(proximoNumero, titular, cpf, dataNascimento, 0);
        }

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
            System.out.println("Saldo: R$" + conta.getSaldo());
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
        } else if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).aplicarRendimento(percentual);
        } else {
            System.out.println("Conta corrente não possui rendimento.");
        }
    }

    public void listarContas() {

        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (ContaBancaria conta : contas) {

            String tipo;

            if (conta instanceof ContaCorrente) {
                tipo = "Corrente";
            } else {
                tipo = "Poupança";
            }

            System.out.println(
                    "Conta: " + conta.getNumero()
                            + " | Titular: " + conta.getTitular()
                            + " | Tipo: " + tipo
                            + " | Saldo: R$" + conta.getSaldo());
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

        if (contaOrigem.getSaldo() < valor) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);

        System.out.println("Transferência realizada.");
    }
}