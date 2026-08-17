public class ContaBancária {
    Titular titular;
    double saldo;
    int operacao;

    ContaBancária(Titular titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }



    
    void DepositarValor(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor Inválido");
        } else {
            saldo += valor;
        }
    }

    void sacar(double valor){
        if(valor + 0.50 <= saldo){
            saldo -= (valor + 0.50);
            System.out.println("\nSaque realizado com sucesso!");
        }
        else{
            System.out.println("\nSaldo insuficiente para o saque.");
        }
    }
    void exibirSaldo(){
        System.out.println("\nSaldo atual: " + saldo);
        System.out.println("Titular: " + titular);
    }

    void transferir(ContaBancária destinatario, double valor){
        if (valor <= saldo){
                saldo -= valor;
                destinatario.DepositarValor(valor);
        }
        else{
            System.out.println("\nSaldo insuficiente");
        }
    }

    void aplicarRendimento(double percentual){
        if (percentual <= 0 || percentual > 100){
            System.out.println("\nPercentual inválido");
        }
        else{
            saldo += saldo * percentual / 100;
            System.out.println("\nRendimento aplicado com sucesso!");
        }
    }
}

