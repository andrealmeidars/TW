package test;


import main.Triangulo;
import main.tinyTypes.AlturaDireita;
import main.tinyTypes.AlturaEsquerda;
import main.tinyTypes.Base;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TrianguloTest {

    @Test
    public void retornaSeBaseForValor4() throws Exception {

        Triangulo triangulo = new Triangulo(new Base(4), new AlturaDireita(6), new AlturaEsquerda(7));
        assertThat(triangulo.retornaValorBase(), is(4.0));

    }




    }

