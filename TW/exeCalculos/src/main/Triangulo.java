package main;

import java.lang.Math;

public class Triangulo implements objetoGeometricoInterface {
    private double base;
    private double alturaDireita;
    private double alturaEsquerda;
    private String nomeObjeto;

        public Triangulo(double base, double alturaDireita, double alturaEsquerda){
            this.base = base;
            this.alturaDireita = alturaDireita;
            this.alturaEsquerda = alturaEsquerda;
            this.nomeObjeto = "Triangulo";

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

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}
