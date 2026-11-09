package frota;

public class Main {
    public static void main(String[] args) {
        Despacho despacho = new Despacho();

        despacho.adicionar(new Caminhao("ABC-1234", 8000));
        despacho.adicionar(new Caminhao("DEF-5678", 3000));
        despacho.adicionar(new Van("GHI-9012", 1200));
        despacho.adicionar(new Moto("JKL-3456", 50));

        despacho.imprimirRelatorio(100);
    }
}
