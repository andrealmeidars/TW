package main;

public class Losango implements objetoGeometricoInterface {
    private double medidaDiagonalMenor;
    private double medidaDiagonalMaior;
    private String nomeObjeto;



    public Losango(double medidaDiagonalMenor, double medidaDiagonalMaior){
        this.medidaDiagonalMenor = medidaDiagonalMenor;
        this.medidaDiagonalMaior = medidaDiagonalMaior;

    }


    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;

    }

    @Override
    public double calculaArea() {
        return (medidaDiagonalMaior * medidaDiagonalMenor) / 2;
    }

    @Override
    public double calculaPerimetro() {
        return medidaDiagonalMaior + medidaDiagonalMenor;
    }


}
