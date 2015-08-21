package test;

import main.Quadrado;
import org.junit.Test;

/**
 * Created by andrealmeida on 20/08/15.
 */
public class QuadradoTest {

    @Test(expected = IllegalArgumentException.class)
    public void deveAtirarExceptionSeArgumentoNegativo(){
        Quadrado quadrado = new Quadrado(-1,5);
        quadrado.calculaPerimetro();
    }
}