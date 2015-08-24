package main;

public class App {

    public static void main(String[] args) {
        Imprimir imprime = new Imprimir();

        calculaFormasGeometricas calculaForma = new calculaFormasGeometricas(imprime);


        //calculaForma.calculaFormas(new Circulo(null));
        //calculaForma.calculaFormas(new Quadrado(2, 4));
        calculaForma.calculaFormas(new Retangulo(0, 0));
        //calculaForma.calculaFormas(new Losango(4, 3));

    }
}
