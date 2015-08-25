package main;

import main.tinyTypes.Altura;
import main.tinyTypes.Base;
import main.tinyTypes.Raio;

public class App {

    public static void main(String[] args) {
        Imprimir imprime = new Imprimir();

        CalculaFormasGeometricas calculaForma = new CalculaFormasGeometricas(imprime);


        calculaForma.calculaFormas(new Circulo(new Raio(2.2)));
        calculaForma.calculaFormas(new Quadrado(new Base(2.2), new Altura(4.0)));
        //calculaForma.calculaFormas(new Retangulo(0, 0));
        //calculaForma.calculaFormas(new Losango(4, 3));
        calculaForma.calculaFormas(new Oval(0,0));


    }
}
