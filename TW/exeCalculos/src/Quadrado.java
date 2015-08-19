

import java.lang.Math;

public class Quadrado extends FiguraAbstrata {
    private double base;
    private double altura;


    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
        super.setNomeObjeto("Quadrado");
    }

    @Override
    public double calculaArea(){
        return Math.pow(base, 2);
    }


    @Override
    public double calculaPerimetro(){
        return  Math.pow(base, 4);

    }





}
