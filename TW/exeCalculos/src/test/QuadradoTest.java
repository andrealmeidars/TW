package test;

import main.Quadrado;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuadradoTest {

    @Test(expected = IllegalArgumentException.class)
    public void deveAtirarExceptionSeArgumentoNegativo() throws Exception {
        Quadrado quadrado = new Quadrado(-2,-4);

        assertThat(quadrado.calculaPerimetro(), is(0));


    }
}