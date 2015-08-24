package main;

public class Retangulo implements objetoGeometricoInterface {
    private double base;
    private double altura;
    private String nomeObjeto;


    public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;
         this.nomeObjeto = "Retangulo";
    }

    @Override
    public double calculaArea(){
        return base * altura;
    }

    @Override
    public double calculaPerimetro(){
        return (2 * base) + (2 * altura);
    }

    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}


