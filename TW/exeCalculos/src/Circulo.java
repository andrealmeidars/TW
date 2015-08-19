
import java.lang.Math;

public class Circulo extends FiguraAbstrata {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        super.setNomeObjeto("Circulo");
    }

    @Override
    public double  calculaArea(){
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro(){
        return   2 * Math.PI * raio;
    }
}
