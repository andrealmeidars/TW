package test;

import main.Oval;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class OvalTest {

    @Test (expected = NullPointerException.class)
    public void mostraSeRetornoNaoForNulo() throws Exception {
        Oval oval = new Oval(2,2);

        assertThat(oval.retornaNomeObjeto(), not(null));
        //assertThat(oval.calculaPerimetro(), is(0.0));



    }

}