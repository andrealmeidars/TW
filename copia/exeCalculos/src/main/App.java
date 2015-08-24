package main;

public class App {

    public static void main(String[] args) {
        Imprimir imprime = new Imprimir();

        FormaGeometrica forma = new FormaGeometrica(imprime);

        forma.calculaFormas(new Quadrado(2,4));
        forma.calculaFormas(new Retangulo(2,6));
        forma.calculaFormas(new Losango(4,3));

    }
}
