package main;

import main.tinyTypes.Altura;
import main.tinyTypes.Base;
import main.tinyTypes.Raio;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Imprimir imprime = new Imprimir();

        CalculaFormasGeometricas calculaForma = new CalculaFormasGeometricas(imprime);


        //calculaForma.calculaFormas(new Circulo(new Raio(2.2)));
        //calculaForma.calculaFormas(new Quadrado(new Base(2.2), new Altura(4.0)));
        //calculaForma.calculaFormas(new Retangulo(new Base(2), new Altura(4)));
       // calculaForma.calculaFormas(new Losango(new MedidaDiagonalMenor(-2.2), new MedidaDiagonalMaior(-2.2)));
        //calculaForma.calculaFormas(new Oval(new Raio(2),new Raio(2)));

        Circulo circulo = new Circulo(new Raio(2));
        Quadrado quadrado = new Quadrado(new Base(2), new Altura(4));

        List<ObjetoGeometrico> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);


        calculaForma.imprimeLista(listaFormas);




    }
}
