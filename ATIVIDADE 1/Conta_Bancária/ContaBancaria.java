package Conta_Bancária;

import java.util.ArrayList;

public class ContaBancaria {

    protected int numero;
    protected String titular;
    protected String cpf;
    protected String dataNascimento;
    protected double saldo;
    protected ArrayList<Double> movimentacoes;

    public ContaBancaria(int numero, String titular, String cpf, String dataNascimento, double saldoInicial) {

        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        if (saldoInicial < 0) {
            saldo = 0;
        } else {
            saldo = saldoInicial;
        }

        movimentacoes = new ArrayList<>();
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
}