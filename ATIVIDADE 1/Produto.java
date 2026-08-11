public class Produto {

    String nome;
    double preco;
    int estoque;

    void exibirInfo() {
        System.out.println("Nome - " + nome);
        System.out.println("Preço - " + preco);
        System.out.println("Quantidade - " + estoque);
    }

    void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }


    }
}