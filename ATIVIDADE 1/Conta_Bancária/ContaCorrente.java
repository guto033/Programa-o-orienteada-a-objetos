package Conta_Bancária;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, String titular, String cpf, String dataNascimento, double saldoInicial) {

        super(numero, titular, cpf, dataNascimento, saldoInicial);
    }

    @Override
    public void sacar(double valor) {

        double total = valor + 0.50;

        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (total > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= total;
            movimentacoes.add(-total);
            System.out.println("Saque realizado. Tarifa de R$0,50 aplicada.");
        }
    }
}