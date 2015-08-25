package main;

import main.tinyTypes.Raio;

public class Circulo implements ObjetoGeometrico {

    private final Raio raio;
    private String nomeObjeto;

    public Circulo(Raio raio){
        this.raio = raio;
        this.nomeObjeto = "Circulo";

    }

    @Override
    public double calculaArea(){
        if (raio == null){
            throw new NullPointerException();
        }
        return Math.PI * raio.getValue() * raio.getValue();
    }

    @Override
    public double calculaPerimetro(){
        return   2 * Math.PI * raio.getValue();
    }


    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}
