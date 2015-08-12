
package trabalhogbsistemas;

public class Token {
    
    private String valor;
    private String tipo;

    public Token(String valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public Token() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString() {
        //return this.valor + "\t (" + this.tipo + ")";
        return this.valor;
    }
    
   
    
    
}
