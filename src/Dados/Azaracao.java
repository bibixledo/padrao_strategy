package Dados;
import Interface.ICalcularAzar;

public class Azaracao {
    private double azarVida;
    private double azarJogo;
    private String jogo;
    protected ICalcularAzar estrategiaDeCalculo = null; 
    
    public Azaracao(String jogo, double azarVida, double azarJogo) {
	this.azarVida = azarVida;
        this.azarJogo = azarJogo;
	switch (jogo) {
            case ("Poker"):
		estrategiaDeCalculo = new CalcularAzarPoker();
		jogo = "Poker";
		break;
            case ("Caca Niquel"):
		estrategiaDeCalculo = new CalcularAzarCacaNiquel();
		jogo = "Caca Niquel";
		break;
	default:
		throw new RuntimeException("Jogo nao encontrado :/");
	}
    }
    

    public double getAzarVida() {
        return azarVida;
    }

    public void setAzarVida(double azarVida) {
        this.azarVida = azarVida;
    }


    public double getAzarJogo() {
        return azarJogo;
    }


    public void setAzarJogo(double azarJogo) {
        this.azarJogo = azarJogo;
    }


    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }
       
    public double calcularAzar(){
        return this.estrategiaDeCalculo.calcularAzaracao(this);
    }
    
}
