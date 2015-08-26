package main;

import main.tinyTypes.AlturaDireita;
import main.tinyTypes.AlturaEsquerda;
import main.tinyTypes.Base;

import java.lang.Math;

public class Triangulo implements ObjetoGeometrico {
    private Base base;
    private AlturaDireita alturaDireita;
    private AlturaEsquerda alturaEsquerda;
    private String nomeObjeto;

        public Triangulo(Base base, AlturaDireita alturaDireita, AlturaEsquerda alturaEsquerda){
            this.base = base;
            this.alturaDireita = alturaDireita;
            this.alturaEsquerda = alturaEsquerda;
            this.nomeObjeto = "Triangulo";
        }

    @Override
    public double  calculaArea(){
        double perimetro = base.getValue() + alturaDireita.getValue() + alturaEsquerda.getValue() / 2;
        return Math.sqrt(perimetro * (perimetro - base.getValue()) * (perimetro - alturaDireita.getValue()) * (perimetro - alturaEsquerda.getValue()));
    }

    @Override
    public double calculaPerimetro(){
        return base.getValue() + alturaDireita.getValue() + alturaEsquerda.getValue();
     }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }

    public double retornaValorBase(){
        return base.getValue();
    }
}
