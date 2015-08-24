package main;

import java.lang.Math;

public class Oval implements objetoGeometricoInterface {
    private double raio1;
    private  double raio2;
    private String nomeObjeto;


    public Oval(double raio1, double raio2){
        this.raio1 = raio1;
        this.raio2 = raio2;
        this.nomeObjeto = "oval";
    }


    @Override
    public double calculaArea() {
        return Math.PI * (raio1 + raio2) ;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * Math.PI ;
    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}
