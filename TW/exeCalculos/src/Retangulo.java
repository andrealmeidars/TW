/**
 * Created by andrealmeida on 16/08/15.
 */
public class Retangulo {
    private double base;
    private  double altura;


    public Retangulo(double base, double altura){
         this.base = base;
         this.altura = altura;

    }

    public void  calculaArea_perimetro(){
        Imprimir imprime = new Imprimir();
        imprime.imprimeNaTela( "Area do Retangulo é : ",  base * altura );
        imprime.imprimeNaTela( "Perimetro do Retangulo é : ",  (2 * base) + (2 * altura)  );
    }



}


