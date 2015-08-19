
import java.lang.Math;

public class Circulo extends FiguraAbstrata {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        super.setNomeObjeto("Circulo");
    }

    public double  calculaArea(){
        return Math.PI * raio * raio;
    }

    public double calculaPerimetro(){
        return   2 * Math.PI * raio;
    }
}
