package test;


import main.Losango;
import main.tinyTypes.MedidaDiagonalMaior;
import main.tinyTypes.MedidaDiagonalMenor;
import org.junit.Test;

public class LosangoTest {

        @Test(expected = IllegalArgumentException.class)
        public void retornaExceptionSeNomeForNulo() throws Exception {

            Losango losango = new Losango(new MedidaDiagonalMenor(2), new MedidaDiagonalMaior(2));
            losango.retornaNomeObjeto();



        }
}
