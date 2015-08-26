package main;

import java.util.List;

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

    public void imprimeLista(List<ObjetoGeometrico> lista){

        for (ObjetoGeometrico forma : lista){
            imprime.imprimeNaTela(  "Área do " + forma.retornaNomeObjeto() +  " = "  , forma.calculaArea());
            imprime.imprimeNaTela(  "Perimetro do " + forma.retornaNomeObjeto() +  " = "  , forma.calculaPerimetro());
            System.out.println("============================");

        }





    }

}
