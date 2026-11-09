import frota.despacho.Despacho;
import frota.veiculos.Bicicleta;
import frota.veiculos.Caminhao;
import frota.veiculos.Moto;
import frota.veiculos.Van;

public class Main {
    public static void main(String[] args) {
        Despacho despacho = new Despacho();
        despacho.adicionar(new Caminhao("CAM-1111", 5000));
        despacho.adicionar(new Van("VAN-2222", 1200));
        despacho.adicionar(new Moto("MOT-3333", 50));
        despacho.adicionar(new Bicicleta("BIC-4444", 15));

        despacho.imprimirRelatorio(80);
        despacho.imprimirRelatorio(3);  
    }
}
