package test;


import main.Circulo;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CirculoTest {


    @Test
    public void deveRetornarZeroSeRaioForNulo() throws Exception {
        Circulo circulo = new Circulo(null);
        assertThat(circulo.calculaArea(), is(0.0));
        assertThat(is(not(null)));
    }


}
