public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.estoque = 10;

        produto.exibirInfo();
        produto.vender(2);
        produto.exibirInfo();
    }

}