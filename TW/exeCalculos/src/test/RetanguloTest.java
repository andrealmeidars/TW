package test;


import main.Retangulo;
import main.tinyTypes.Altura;
import main.tinyTypes.Base;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class RetanguloTest {



    @Test(expected = NullPointerException.class)
     public void retornaErroSeNomeEstiverNulo() throws Exception {
        Retangulo retangulo = new Retangulo(new Base(2), new Altura(2));

        assertThat(retangulo.retornaNomeObjeto(), is("INVALIDO"));
        assertThat(null, is(not(null)));
    }



    }