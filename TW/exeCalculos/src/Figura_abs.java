
abstract class Figura_abs {
    protected String nomeObjeto;

    abstract double calculaArea();
    abstract double calculaPerimetro();


    public String getNomeObjeto(){
        return nomeObjeto;
     }

    public void setNomeObjeto(String nome){
        this.nomeObjeto = nome;
    }

}
