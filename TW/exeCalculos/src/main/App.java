package main;

import main.tinyTypes.*;

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

        //Circulo circulo = new Circulo(new Raio(2.2));
        //Quadrado quadrado = new Quadrado(new Base(2.2), new Altura(4.0));
        //listaFormas.add(quadrado);

        List<ObjetoGeometrico> listaFormas = new ArrayList<>();
        listaFormas.add(new Circulo(new Raio(2.2)));
        listaFormas.add(new Quadrado(new Base(2.2), new Altura(4.0)));
        listaFormas.add(new Retangulo(new Base(2), new Altura(4)));
        listaFormas.add(new Losango(new MedidaDiagonalMenor(2.2), new MedidaDiagonalMaior(2.2)));
        listaFormas.add(new Oval(new Raio(2), new Raio(2)));

        calculaForma.imprimeLista(listaFormas);




    }
}
