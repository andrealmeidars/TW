package main;

public class Retangulo implements objetoGeometrico {
    private double base;
    private double altura;
    private String nomeObjeto;


    public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;
         //this.nomeObjeto = "Retangulo";
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
        if (nomeObjeto == null){
            return "INVALIDO";
        }
        return nomeObjeto;
    }
}


