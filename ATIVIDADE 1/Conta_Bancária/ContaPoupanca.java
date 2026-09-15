package Conta_Bancária;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String titular, String cpf, String dataNascimento, double saldoInicial) {

        super(numero, titular, cpf, dataNascimento, saldoInicial);
    }

    public void aplicarRendimento(double percentual) {

        if (percentual <= 0) {
            System.out.println("Percentual inválido.");
            return;
        }

        double rendimento = saldo * percentual / 100;
        saldo += rendimento;
        movimentacoes.add(rendimento);

        System.out.println("Rendimento aplicado.");
    }
}