
public class Retangulo extends Figura_abs {
    private double base;
    private double altura;


    public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;
         super.setNomeObjeto("Retangulo");
    }

    public double  calculaArea(){
        return base * altura;
    }

    public double calculaPerimetro(){
        return (2 * base) + (2 * altura);
    }






}


