package test;

import main.Oval;
import main.tinyTypes.Raio;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class OvalTest {

    @Test
    public void mostraSeRetornoNaoForNulo() throws Exception {
        Oval oval = new Oval(new Raio(2), new Raio(2));

        assertThat(oval.retornaNomeObjeto(), not(null));
        



    }

}
