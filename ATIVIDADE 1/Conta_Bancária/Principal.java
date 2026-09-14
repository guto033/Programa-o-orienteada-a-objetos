package Conta_Bancária;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;

        do {
            System.out.println();
            System.out.println("=== BANCO ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataNascimento = scanner.nextLine();

                    banco.abrirConta(nome, cpf, dataNascimento);
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    int contaSaque = scanner.nextInt();

                    System.out.print("Valor: ");
                    double valorSaque = scanner.nextDouble();

                    banco.sacar(contaSaque, valorSaque);
                    break;

                case 3:
                    System.out.print("Número da conta: ");
                    int contaDeposito = scanner.nextInt();

                    System.out.print("Valor: ");
                    double valorDeposito = scanner.nextDouble();

                    banco.depositar(contaDeposito, valorDeposito);
                    break;

                case 4:
                    System.out.print("Conta de origem: ");
                    int origem = scanner.nextInt();

                    System.out.print("Conta de destino: ");
                    int destino = scanner.nextInt();

                    System.out.print("Valor: ");
                    double valorTransferencia = scanner.nextDouble();

                    banco.transferir(origem, destino, valorTransferencia);
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int contaSaldo = scanner.nextInt();

                    banco.consultarSaldo(contaSaldo);
                    break;

                case 6:
                    System.out.print("Número da conta: ");
                    int contaExtrato = scanner.nextInt();

                    banco.exibirExtrato(contaExtrato);
                    break;

                case 7:
                    System.out.print("Número da conta: ");
                    int contaRendimento = scanner.nextInt();

                    System.out.print("Percentual: ");
                    double percentual = scanner.nextDouble();

                    banco.aplicarRendimento(contaRendimento, percentual);
                    break;

                case 8:
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}