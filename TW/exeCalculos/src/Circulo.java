/**
 * Created by andrealmeida on 16/08/15.
 */
public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void  calculaArea_perimetro(){
        Imprimir imprime = new Imprimir();
        imprime.imprimeNaTela( "Area do Circulo é : ",  Math.PI * raio * raio  );
        imprime.imprimeNaTela( "Perimetro do Circulo é : ",  2 * Math.PI * raio   );
    }
}
