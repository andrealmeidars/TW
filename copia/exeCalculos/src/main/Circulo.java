package main;

public class Circulo implements objetoGeometricoInterface {

    private Double raio;
    private String nomeObjeto;

    public Circulo(Double raio){
        this.raio = raio;
        this.nomeObjeto = "Circulo";


    }

    @Override
    public double  calculaArea(){
        if (raio == null){
            return  0;
        }
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro(){
        return   2 * Math.PI * raio;
    }


    @Override
    public String retornaNomeObjeto() {
        return nomeObjeto;
    }
}
