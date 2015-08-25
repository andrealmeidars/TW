package main;

import main.tinyTypes.Raio;

import java.lang.Math;

public class Oval implements ObjetoGeometrico {
    private Raio raio1;
    private  Raio raio2;
    private String nomeObjeto;


    public Oval(Raio raio1, Raio raio2){
        this.raio1 = raio1;
        this.raio2 = raio2;
        this.nomeObjeto = "oval";
    }


    @Override
    public double calculaArea() {
        return Math.PI * (raio1.getValue() + raio2.getValue()) ;
    }

    @Override
    public double calculaPerimetro() {
        //return 4 * Math.PI ;
        return 0.0;


    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;

    }
}
