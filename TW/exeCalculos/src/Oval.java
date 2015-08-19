import java.lang.Math;

public class Oval extends FiguraAbstrata {
    private double raio1;
    private  double raio2;


    public Oval(double raio1, double raio2){
        this.raio1 = raio1;
        this.raio2 = raio2;
        super.setNomeObjeto("Oval");


    }


    @Override
    double calculaArea() {
        return Math.PI * (raio1 + raio2) ;
    }

    @Override
    double calculaPerimetro() {
        return 4 * Math.PI ;
    }
}
