package Dados;
import Interface.ICalcularAzar;


public class CalcularAzarCacaNiquel implements ICalcularAzar{

    @Override
    public double calcularAzaracao(Azaracao objeto) {    
        double taxaAzar=0;
        
        if(objeto.getAzarVida()<= 50){
            taxaAzar = objeto.getAzarJogo() * 0.01 + 
                    objeto.getAzarVida() * 0.03;
        }else{
            taxaAzar = objeto.getAzarJogo() * 0.03 + 
                    objeto.getAzarVida() * 0.05;
        }
        return 0;
     
    }
    
}

