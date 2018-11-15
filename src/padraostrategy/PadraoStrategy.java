package padraostrategy;
import Dados.*;

public class PadraoStrategy {

    public static void main(String[] args) {
        //Inserir numeros de 0 a 100
        Azaracao Ana = new Azaracao("Poker", 50, 10);
        Azaracao Bruno = new Azaracao("Caca Niquel", 10, 50);
        
        String saidaA = "Azar da Ana: " + Ana.calcularAzar() + "% "  ;
        String saidaB = "Azar do Bruno: " + Bruno.calcularAzar() + "% ";
        
        System.out.println(saidaA);
        System.out.println(saidaB);
    }
    
}
