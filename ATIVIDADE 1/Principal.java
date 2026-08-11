public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.estoque = 10;

        produto.exibirInfo();
        produto.vender(2);
        produto.exibirInfo();


        Filme filme1= new Filme();

        filme1.titulo = "Apimentadas";
        filme1.duracao = 120;
        filme1.nota = 8.5;
        filme1.assistido = true;
        
        Filme filme2= new Filme();

        filme2.titulo = "Cavaleiro Solitário";
        filme2.duracao = 110;
        filme2.nota = 9.2;
        filme2.assistido = false;

        Filme filme3= new Filme();

        filme3.titulo = "ta dando onda";
        filme3.duracao = 90;
        filme3.nota = 9.0;
        filme3.assistido = true;

        filme1.marcarAssistido();
        filme2.avaliar(9.5);


        ContaBancária conta1 = new ContaBancária();

        conta1.titular = "Augusto";
        conta1.saldo = 1000.00;

         ContaBancária conta2 = new ContaBancária();

        conta2.titular = "Carlos";
        conta2.saldo = 9000.00;

        conta1.sacar(500);
        conta1.exibirSaldo();

        conta2.DepositarValor(4000);
        conta2.exibirSaldo();

        conta1.transferir(conta2, 200);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }

}