package main;

import main.tinyTypes.Altura;
import main.tinyTypes.Base;

public class Quadrado implements ObjetoGeometrico {
    private Base base;
    private Altura altura;
    private String nomeObjeto;


    public Quadrado(Base base, Altura altura){
        this.base = base;
        this.altura = altura;
        this.nomeObjeto = "Quadrado";
    }

    @Override
    public double calculaArea(){
        return Math.pow(base.getValue(), 2);
    }


    @Override
    public double calculaPerimetro(){

        if (base.getValue() < 0 || altura.getValue() < 0){
            throw  new IllegalArgumentException();
        }
        return  Math.pow(base.getValue(), 4);

    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }

    public double calcularHipotenusa() {
        return Math.sqrt((base.getValue()*base.getValue())+(altura.getValue()*altura.getValue()));
    }
}
