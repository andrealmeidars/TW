package main;

import main.tinyTypes.MedidaDiagonalMaior;
import main.tinyTypes.MedidaDiagonalMenor;

public class Losango implements ObjetoGeometrico {
    private MedidaDiagonalMenor medidaDiagonalMenor;
    private MedidaDiagonalMaior medidaDiagonalMaior;
    private String nomeObjeto;



    public Losango(MedidaDiagonalMenor medidaDiagonalMenor, MedidaDiagonalMaior medidaDiagonalMaior){
        this.medidaDiagonalMenor = medidaDiagonalMenor;
        this.medidaDiagonalMaior = medidaDiagonalMaior;
        //this.nomeObjeto = "Losango";

    }


    @Override
    public String retornaNomeObjeto() {
        if (nomeObjeto == null){
             throw  new IllegalArgumentException();
        }
        return nomeObjeto;

    }

    @Override
    public double calculaArea() {
        return (medidaDiagonalMaior.getValue() * medidaDiagonalMenor.getValue()) / 2;
    }

    @Override
    public double calculaPerimetro() {
        return medidaDiagonalMaior.getValue() + medidaDiagonalMenor.getValue();
    }


}
