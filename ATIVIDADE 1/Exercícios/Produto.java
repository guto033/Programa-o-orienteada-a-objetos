package Exercícios;
public class Produto {

    String nome;
    double preco;
    int estoque;

    Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void exibirInfo() {
        System.out.println("\nNome - " + nome);
        System.out.println("Preço - " + preco);
        System.out.println("Quantidade - " + estoque);
    }

    void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("\nVenda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}