/*
 * Código Desenvolvido por André Almeida - Sistemas de Informação / UniRitter 2015
 * Fornecido para ThoughtWorks - 01/05/2015 
 * Mail :andre.almeida@msn.com 
 */
package exerciciotw;

/**
 *
 * @author André Almeida - 01/05/2015 - Fornecido para ThoughtWorks
 */
public class Hotel {
    private int valorSemanaRegular;
    private int valorSemanaSpecial;
    private int valorFimSemanaRegular;
    private int valorFimSemanaSpecial;
    private int classificaHotel;
    private String nomeHotel;
    private int valorEstadia;
    
    
    public Hotel(String nomeHotel, int classificaHotel, int valorSemanaRegular, int valorSemanaSpecial, int valorFimSemanaRegular, int valorFimSemanaSpecial){
        this.nomeHotel = nomeHotel;
        this.classificaHotel = classificaHotel;
        this.valorSemanaRegular = valorSemanaRegular;
        this.valorSemanaSpecial = valorSemanaSpecial;
        this.valorFimSemanaRegular = valorFimSemanaRegular;
        this.valorFimSemanaSpecial = valorFimSemanaSpecial;
    }

    public int getValorSemanaRegular() {
        return valorSemanaRegular;
    }

    public int getValorSemanaSpecial() {
        return valorSemanaSpecial;
    }

    public int getValorFimSemanaRegular() {
        return valorFimSemanaRegular;
    }

    public int getValorFimSemanaSpecial() {
        return valorFimSemanaSpecial;
    }
    
    public int getClassificacaoHotel(){
        return classificaHotel;
    }
    
    public String getNomeHotel(){
        return nomeHotel;
    }
    
    public void setValorEstadia(int valor){
        this.valorEstadia = valor;
    }
    
    public int getValorEstadia(){
        return valorEstadia;
    }
    
    
    
    
    
    
    
    
}
