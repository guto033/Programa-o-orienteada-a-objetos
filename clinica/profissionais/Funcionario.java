
public abstract class Funcionario {
    private final String nome;

    protected Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
