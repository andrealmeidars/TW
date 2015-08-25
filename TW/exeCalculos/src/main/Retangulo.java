package main;

import main.tinyTypes.Altura;
import main.tinyTypes.Base;

public class Retangulo implements ObjetoGeometrico {
    private Base base;
    private Altura altura;
    private String nomeObjeto;


    public Retangulo(Base base, Altura altura){
         this.base = base;
         this.altura = altura;
         //this.nomeObjeto = "Retangulo";
    }

    @Override
    public double calculaArea(){
        return base.getValue() * altura.getValue();
    }

    @Override
    public double calculaPerimetro(){
        return (2 * base.getValue()) + (2 * altura.getValue());
    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}


