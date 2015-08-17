

import java.lang.Math;

public class Quadrado {
    private double base;
    private double altura;

    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;

    }

    public void  calculaArea_perimetro(){
        Imprimir imprime = new Imprimir();
        imprime.imprimeNaTela( "Area do quadrado é : ",  Math.pow(base, 2));
        imprime.imprimeNaTela( "Perimetro do quadrado é : ",  Math.pow(base, 4));
    }



}
