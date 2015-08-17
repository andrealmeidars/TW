/**
 * Created by andrealmeida on 16/08/15.
 */
public class Triangulo {
    private double base;
    private double alturaDireita;
    private double alturaEsquerda;

        public Triangulo(double base, double alturaDireita, double alturaEsquerda){
            this.base = base;
            this.alturaDireita = alturaDireita;
            this.alturaEsquerda = alturaEsquerda;

        }

        public void  calculaArea_perimetro(){
            Imprimir imprime = new Imprimir();

            double perimetro = base + alturaDireita + alturaEsquerda / 2;

            imprime.imprimeNaTela( "Area do Triangulo é : ",  Math.sqrt(perimetro*(perimetro-base)*(perimetro-alturaDireita)*(perimetro-alturaEsquerda)) );
            imprime.imprimeNaTela( "Perimetro do Triangulo é : ", perimetro * 2  );
    }



}
