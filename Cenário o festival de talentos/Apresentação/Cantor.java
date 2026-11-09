public class Cantor extends Participante {
    private final String musica;

    public Cantor(String nome, String turma, String musica, int duracaoMinutos) {
        super(nome, turma, duracaoMinutos);
        this.musica = musica;
    }

    @Override
    public void apresentar() {
        System.out.println(identificacao() + " canta \"" + musica + "\" (" + getDuracaoMinutos() + " min)");
    }
}