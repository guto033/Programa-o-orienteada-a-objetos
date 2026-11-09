public abstract class Participante implements Apresentavel {
    private String nome;
    private String turma;
    private int duracaoMinutos;

    protected Participante(String nome, String turma, int duracaoMinutos) {
        this.nome = nome;
        this.turma = turma;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    protected String identificacao() {
        return nome + " (" + turma + ")";
    }
}