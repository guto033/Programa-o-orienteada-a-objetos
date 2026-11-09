package clinica.profissionais;

// Só guarda o que todo funcionário tem em comum: o nome. Nenhuma capacidade aqui.
public abstract class Funcionario {
    private final String nome;

    protected Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
