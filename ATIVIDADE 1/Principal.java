import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        
        Banco banco = new Banco();

        Titular titular1 = new Titular("Augusto", "12345", null);
        Titular titular2 = new Titular("João", "67890", null);

        banco.abrirConta(titular1);
        banco.abrirConta(titular2);

        banco.depositar(1, 500.0);
        banco.sacar(1, 100.0);

        banco.consultar(1);

        banco.depositar(2, 1000.0);

        banco.transferir(1, 2, 200.0);

        banco.consultar(1);
        banco.consultar(2);
    }
}