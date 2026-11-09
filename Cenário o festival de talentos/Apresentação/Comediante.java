public class Comediante extends Participante {
    private final String tema;

    public Comediante(String nome, String turma, String tema, int duracaoMinutos) {
        super(nome, turma, duracaoMinutos);
        this.tema = tema;
    }

    @Override
    public void apresentar() {
        System.out.println( identificacao() + " faz comédia sobre " + tema + " (" + getDuracaoMinutos() + " min)");
    }
}