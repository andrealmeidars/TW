package test;
//import static org.junit.Assert.*;


import main.Circulo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class CirculoTest {


    @Test(expected = NullPointerException.class)
    public void deveRetornarZeroSeRaioForNulo() throws Exception {

        Circulo circulo = new Circulo(null);


        assertThat(circulo.calculaArea(), is(0.0));
        assertThat(null,is(not(null)));
    }


}

