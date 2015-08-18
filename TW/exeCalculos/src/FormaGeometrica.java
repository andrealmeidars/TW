
public class FormaGeometrica {




    public void calculaFormas(Figura_abs formaGeometrica){
        Imprimir imprime = new Imprimir();

        imprime.imprimeNaTela(  "Área do " + formaGeometrica.getNomeObjeto() +  " = "  , formaGeometrica.calculaArea());
        imprime.imprimeNaTela(  "Perimetro do " + formaGeometrica.getNomeObjeto() +  " = "  , formaGeometrica.calculaPerimetro());
        System.out.println("============================");
    }

}
