package main.tinyTypes;


public class MedidaDiagonalMenor implements Parametros {
    private static double value;

    public MedidaDiagonalMenor (double value){
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
