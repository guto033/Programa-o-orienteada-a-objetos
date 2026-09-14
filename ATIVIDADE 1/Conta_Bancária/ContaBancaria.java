package Conta_Bancária;
import java.util.ArrayList;

public class ContaBancaria {

    private int numero;
    private String titular;
    private String cpf;
    private String dataNascimento;
    private double saldo;
    private ArrayList<Double> movimentacoes;

    public ContaBancaria(int numero, String titular, String cpf, String dataNascimento, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

        this.movimentacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getOperacoes() {
        return movimentacoes.size();
    }

    public void setTitular(String novo) {
        if (novo == null || novo.isEmpty()) {
            System.out.println("Titular inválido");
        } else {
            titular = novo;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            movimentacoes.add(valor);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            movimentacoes.add(-valor);
        }
    }

    public void exibirExtrato() {
        for (double movimentacao : movimentacoes) {
            System.out.println(movimentacao);
        }
    }

    public double totalDepositado() {
        double total = 0;

        for (double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                total += movimentacao;
            }
        }

        return total;
    }

    public double maiorSaque() {
        double maior = 0;

        for (double movimentacao : movimentacoes) {
            if (movimentacao < 0 && -movimentacao > maior) {
                maior = -movimentacao;
            }
        }

        return maior;
    }

    public void aplicarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = saldo * percentual / 100;
            saldo += rendimento;
            movimentacoes.add(rendimento);
        } else {
            System.out.println("Percentual inválido.");
        }
    }
}