

import java.lang.Math;

public class Quadrado extends Figura_abs {
    private double base;
    private double altura;


    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
        super.setNomeObjeto("Quadrado");
    }

    public double calculaArea(){
        return Math.pow(base, 2);
    }


    public double calculaPerimetro(){
        return  Math.pow(base, 4);

    }





}
