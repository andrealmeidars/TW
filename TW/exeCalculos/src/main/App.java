package main;

import main.tinyTypes.MedidaDiagonalMaior;
import main.tinyTypes.MedidaDiagonalMenor;

public class App {

    public static void main(String[] args) {
        Imprimir imprime = new Imprimir();

        CalculaFormasGeometricas calculaForma = new CalculaFormasGeometricas(imprime);


        //calculaForma.calculaFormas(new Circulo(new Raio(2.2)));
        //calculaForma.calculaFormas(new Quadrado(new Base(2.2), new Altura(4.0)));
        //calculaForma.calculaFormas(new Retangulo(new Base(2), new Altura(4)));
        calculaForma.calculaFormas(new Losango(new MedidaDiagonalMenor(-2.2), new MedidaDiagonalMaior(-2.2)));
        //calculaForma.calculaFormas(new Oval(new Raio(2),new Raio(2)));




    }
}
