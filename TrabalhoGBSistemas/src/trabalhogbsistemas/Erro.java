
package trabalhogbsistemas;


public class Erro {
    private String erro = "";
    
    
    public Erro(){
    }
    
    
    public void setErro(String erro){
        this.erro = erro;
    }
    
    
    public void imprimeErro(){
        System.out.println(erro);
    }
}
