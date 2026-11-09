;
public class Dancarino extends Participante {
    private String estilo;

    public Dancarino(String nome, String turma, String estilo, int duracaoMinutos) {
        super(nome, turma, duracaoMinutos);
        this.estilo = estilo;
    }

    @Override
    public void apresentar() {
        System.out.println( identificacao() + " dança " + estilo + " (" + getDuracaoMinutos() + " min)");
    }
}
