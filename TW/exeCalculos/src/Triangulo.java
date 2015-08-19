
import java.lang.Math;

public class Triangulo extends FiguraAbstrata {
    private double base;
    private double alturaDireita;
    private double alturaEsquerda;

        public Triangulo(double base, double alturaDireita, double alturaEsquerda){
            this.base = base;
            this.alturaDireita = alturaDireita;
            this.alturaEsquerda = alturaEsquerda;
            super.setNomeObjeto("Triangulo");

        }

    @Override
    public double  calculaArea(){
        double perimetro = base + alturaDireita + alturaEsquerda / 2;
        return Math.sqrt(perimetro * (perimetro - base) * (perimetro - alturaDireita) * (perimetro - alturaEsquerda));
    }

    @Override
    public double calculaPerimetro(){
        return base + alturaDireita + alturaEsquerda;
     }


}
