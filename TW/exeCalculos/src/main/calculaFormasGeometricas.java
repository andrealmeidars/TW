package main;

public class calculaFormasGeometricas {
    private Imprimir imprime;

    public calculaFormasGeometricas(Imprimir imprime)  {
        this.imprime = imprime;
    }

    public void calculaFormas(objetoGeometrico formaGeometrica){

        imprime.imprimeNaTela(  "Área do " + formaGeometrica.retornaNomeObjeto() +  " = "  , formaGeometrica.calculaArea());
        imprime.imprimeNaTela(  "Perimetro do " + formaGeometrica.retornaNomeObjeto() +  " = "  , formaGeometrica.calculaPerimetro());
        System.out.println("============================");

    }

}
