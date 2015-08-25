package main.tinyTypes;


public class MedidaDiagonalMaior implements Parametros {
    private static double value;

    public MedidaDiagonalMaior(double value){
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
