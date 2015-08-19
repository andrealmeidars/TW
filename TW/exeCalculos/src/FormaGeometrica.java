
public class FormaGeometrica {
    private Imprimir imprime;

    public FormaGeometrica(Imprimir imprime) {
        this.imprime = imprime;
    }

    public void calculaFormas(FiguraAbstrata formaGeometrica){

        imprime.imprimeNaTela(  "Área do " + formaGeometrica.getNomeObjeto() +  " = "  , formaGeometrica.calculaArea());
        imprime.imprimeNaTela(  "Perimetro do " + formaGeometrica.getNomeObjeto() +  " = "  , formaGeometrica.calculaPerimetro());
        System.out.println("============================");

    }

}
