package test;

import main.Quadrado;
import main.tinyTypes.Altura;
import main.tinyTypes.Base;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QuadradoTest {

    @Test(expected = IllegalArgumentException.class)
    public void deveAtirarExceptionSeArgumentoNegativo() throws Exception {
        Quadrado quadrado = new Quadrado(new Base(-2), new Altura(-4));
        quadrado.calculaPerimetro();

        //assertThat(quadrado.calculaPerimetro(), is(0));



    }

    @Test
    public void deveCalcularPerimetro() throws Exception {

        Quadrado quadrado = new Quadrado(new Base(2.2), new Altura(2.0));
        double resultado = quadrado.calculaArea();

        assertThat(resultado, is(4.0));

    }

    @Test
    public void deveCalcularHipotenusa() throws Exception {

        Quadrado quadrado = new Quadrado(new Base(4.0), new Altura(2.0));

        double resultado = quadrado.calcularHipotenusa();

        assertThat(resultado, is(4.47213595499958));
        
    }

    //@Test
    //public void () throws Exception {

   // }
}