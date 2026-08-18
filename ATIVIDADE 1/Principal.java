import java.time.LocalDate;

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

        Titular titular1 = new Titular("Augusto", "12345", null);
        ContaBancária c1 = new ContaBancária(titular1, 500);

        c1.DepositarValor(500.0);
        c1.DepositarValor(-50.0);
        c1.sacar(100.0);
        c1.aplicarRendimento(10.0);
        c1.aplicarRendimento(150.0);

        c1.exibirSaldo();

        System.out.println(c1.titular.nome);

        Cliente cliente1 = new Cliente("Augusto", "augusto@email.com");
        Produto produto1 = new Produto("Notebook", 3500);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);

        Cliente cliente2 = new Cliente("João", "joao@email.com");
        Produto produto2 = new Produto("Mouse", 100);

        Pedido pedido2 = new Pedido(cliente2, produto2, 3);
    
        pedido1.resumo();
        pedido2.resumo();


        Consulta consulta = new Consulta("Augusto",LocalDate.of(2026, 8, 20), 200);
        Consulta consulta2 = new Consulta("João",LocalDate.of(2026, 8, 25),250);
        consulta.exibirComprovante();
        consulta2.exibirComprovante();
    }
}
