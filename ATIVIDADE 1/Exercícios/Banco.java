package Exercícios;
import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancária> contas;
    private int proximoNumero;

    Banco() {
        contas = new ArrayList<>();
        proximoNumero = 1;
    }

    void abrirConta(Titular titular) {
        ContaBancária conta = new ContaBancária(proximoNumero, titular);
        contas.add(conta);
        proximoNumero++;
    }

    ContaBancária buscarConta(int numero) {
        for (ContaBancária conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }

        return null;
    }

    void depositar(int numero, double valor) {
        ContaBancária conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.depositar(valor);
    }

    void sacar(int numero, double valor) {
        ContaBancária conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.sacar(valor);
    }

    void consultar(int numero) {
        ContaBancária conta = buscarConta(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        conta.exibirSaldo();
    }

    void transferir(int origem, int destino, double valor) {

        if (origem == destino) {
            System.out.println("Não é possível transferir para a mesma conta.");
            return;
        }

        ContaBancária contaOrigem = buscarConta(origem);
        ContaBancária contaDestino = buscarConta(destino);

        if (contaOrigem == null || contaDestino == null) {
            System.out.println("Uma das contas não foi encontrada.");
            return;
        }

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }
}