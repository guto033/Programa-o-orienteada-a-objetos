import java.time.LocalDate;

public class Consulta{
    String Paciente;
    double valor;
    LocalDate data;

    Consulta (Sring Paciente, LocalDate data, double valor){
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

