package main;

public class Circulo implements objetoGeometrico {

    private Double raio;
    private String nomeObjeto;

    public Circulo(Double raio){
        this.raio = raio;
        this.nomeObjeto = "Circulo";


    }

    @Override
    public double calculaArea(){
        if (raio == null){
            //System.out.println("OBJETO NULO");
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
