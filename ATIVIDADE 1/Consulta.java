import java.time.LocalDate;

public class Consulta{
    String paciente;
    double valor;
    LocalDate data;

    Consulta (String paciente, LocalDate data, double valor){
        this.paciente = paciente;
        this.data = data;
        this.valor = valor; 
    }

    void exibirComprovante(){
        System.out.println("Paciente: " + paciente);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$ " + valor);
    }
}

