public class ContaBancária {
    String titular;
    double saldo;

    void DepositarValor(double valor) {
        saldo += valor;
    }

    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
    void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Titular: " + titular);
    }

    void transferir(ContaBancária destinatario, double valor){
        if (valor <= saldo){
                saldo -= valor;
                destinatario.DepositarValor(valor);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}

