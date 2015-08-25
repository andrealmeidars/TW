package main;

public class CalculaFormasGeometricas {
    private Imprimir imprime;

    public CalculaFormasGeometricas(Imprimir imprime)  {
        this.imprime = imprime;
    }

    public void calculaFormas(ObjetoGeometrico formaGeometrica){

        imprime.imprimeNaTela(  "Área do " + formaGeometrica.retornaNomeObjeto() +  " = "  , formaGeometrica.calculaArea());
        imprime.imprimeNaTela(  "Perimetro do " + formaGeometrica.retornaNomeObjeto() +  " = "  , formaGeometrica.calculaPerimetro());
        System.out.println("============================");

    }

}
