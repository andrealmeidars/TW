
import java.lang.Math;

public class Triangulo extends Figura_abs {
    private double base;
    private double alturaDireita;
    private double alturaEsquerda;

        public Triangulo(double base, double alturaDireita, double alturaEsquerda){
            this.base = base;
            this.alturaDireita = alturaDireita;
            this.alturaEsquerda = alturaEsquerda;
            super.setNomeObjeto("Triangulo");

        }

        public double  calculaArea(){
            double perimetro = base + alturaDireita + alturaEsquerda / 2;
            return Math.sqrt(perimetro * (perimetro - base) * (perimetro - alturaDireita) * (perimetro - alturaEsquerda));
        }

        public double calculaPerimetro(){
            return base + alturaDireita + alturaEsquerda;
        }


}
