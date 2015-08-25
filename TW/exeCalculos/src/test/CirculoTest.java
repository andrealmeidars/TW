package test;
//import static org.junit.Assert.*;


import main.Circulo;
import org.junit.After;
import org.junit.Test;

public class CirculoTest {



    //TODO: receber valor nulo, números negativos

    @Test(expected = NullPointerException.class)
    public void deveRetornarZeroSeRaioForNulo() throws Exception {

        Circulo circulo = new Circulo(null);
        circulo.calculaArea();
    }

    @Test
    public void testName() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }
}

