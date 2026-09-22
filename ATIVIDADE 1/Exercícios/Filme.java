package Exercícios;
public class Filme {
    

    private String titulo;
    private int duracao;
    private double nota;
    private boolean assistido;

    Filme(String titulo, int duracao, double nota, boolean assistido) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.nota = nota;
        this.assistido = assistido;
    }

    void exibirFicha() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
    }

    void marcarAssistido() {
        assistido = true;
    }

    void avaliar(double novaNota) {
        nota = novaNota;
    }
}