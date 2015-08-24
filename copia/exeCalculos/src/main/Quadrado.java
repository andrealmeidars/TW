package main;

import java.lang.Math;

public class Quadrado implements objetoGeometricoInterface {
    private double base;
    private double altura;
    private String nomeObjeto;


    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.nomeObjeto = "Quadrado";
    }

    @Override
    public double calculaArea(){
        return Math.pow(base, 2);
    }


    @Override
    public double calculaPerimetro(){

        if (base < 0 || altura < 0){
            throw  new IllegalArgumentException();
        }
        return  Math.pow(base, 4);

    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}
