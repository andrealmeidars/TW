
public class Losango extends Figura_abs {
    private double medidaDiagonalMenor;
    private double medidaDiagonalMaior;



    public Losango(double medidaDiagonalMenor, double medidaDiagonalMaior){
        this.medidaDiagonalMenor = medidaDiagonalMenor;
        this.medidaDiagonalMaior = medidaDiagonalMaior;
        super.setNomeObjeto("Losango");
    }


    @Override
    double calculaArea() {
        return (medidaDiagonalMaior * medidaDiagonalMenor) / 2;
    }

    @Override
    double calculaPerimetro() {
        return medidaDiagonalMaior + medidaDiagonalMenor;
    }
}
