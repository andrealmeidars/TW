
public class Retangulo extends FiguraAbstrata {
    private double base;
    private double altura;


    public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;
         super.setNomeObjeto("Retangulo");
    }

    @Override
    public double calculaArea(){
        return base * altura;
    }

    @Override
    public double calculaPerimetro(){
        return (2 * base) + (2 * altura);
    }






}


