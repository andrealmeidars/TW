/*
 * Código Desenvolvido por André Almeida - Sistemas de Informação / UniRitter 2015
 * Fornecido para ThoughtWorks - 01/05/2015 
 * Mail :andre.almeida@msn.com 
 */
package exerciciotw;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author André Almeida - 01/05/2015 - Fornecido para ThoughtWorks
 */
        
public class Estadia {
     private List<Hotel> hoteis = new ArrayList <>(); // array para armazenar uma lista de "Hotel"
    
    public Estadia(){
    }
    
    // Método para retornar uma categoria do dia da semana (Semana-Fim_Semana)
    public String retornaPeriodoSemana (String diaSemana){
        String periodoSemana = " ";
        
        switch(diaSemana){
            
             case "mon" : case "tues" : case "wed" : case "thur" : case "fri" :
               periodoSemana = "SEMANA";
            break;
                 
             default: 
                periodoSemana = "FIM_SEMANA";
           }
     return periodoSemana;
    }
    
    // método para retornar o valor de cada hotel, passando um "Hotel" como objeto
    public int retornaValoresHotel(Hotel hotel, String tipoCliente, String dia1, String dia2, String dia3){
        int valorRegular = 0;
        int valorEspecial = 0;     
        int valorFinal = 0;        
        
        
        String[] listaDias = {dia1, dia2, dia3};
        
            for (int i = 0; i <=2; i++){
                String periodoSemana = retornaPeriodoSemana(listaDias[i]); 
                    
                    if( periodoSemana == "SEMANA" && tipoCliente == "REGULAR"){
                        valorRegular = valorRegular + hotel.getValorSemanaRegular();
                        valorFinal = valorRegular;
                    }else if( periodoSemana == "FIM_SEMANA" && tipoCliente == "REGULAR"){
                        valorRegular =  valorRegular + hotel.getValorFimSemanaRegular();            
                        valorFinal = valorRegular;
                    }else if( periodoSemana == "SEMANA" && tipoCliente == "REWARDS"){
                        valorEspecial = valorEspecial + hotel.getValorSemanaSpecial(); 
                        valorFinal = valorEspecial;
                    }else if( periodoSemana == "FIM_SEMANA" && tipoCliente == "REWARDS"){
                        valorEspecial = valorEspecial + hotel.getValorFimSemanaSpecial();
                        valorFinal = valorEspecial;
                    }
            } // fim do for
        return valorFinal;
    }
        
    
    //Método para retornar o nome do hotel com valor mais em conta
    public String retornarHotel(String tipoCliente, String dia1, String dia2, String dia3){
        
        Integer valorMaisBaixo = null;
        Integer categoria = null;
        String nomeHotel = "";
        
        // Instanciando objs "Hotel"
        Hotel LakewoodHotel = new Hotel("Lakewood",3,110,80,90,80); // hotel Lakewood
        Hotel BridgewoodHotel  = new Hotel("Bridgewood",4,160,110,60,50); // hotel Bridgewood
        Hotel RidgewoodHotel   = new Hotel("Ridgewood",5,220,100,150,40); // hotel Ridgewood
        
        
        // return e set de valores de estadia em cada objeto
        LakewoodHotel.setValorEstadia(retornaValoresHotel(LakewoodHotel, tipoCliente, dia1, dia2, dia3));
        BridgewoodHotel.setValorEstadia(retornaValoresHotel(BridgewoodHotel, tipoCliente, dia1, dia2, dia3));
        RidgewoodHotel.setValorEstadia(retornaValoresHotel(RidgewoodHotel, tipoCliente, dia1, dia2, dia3));
        
        // adicionando em um array
        hoteis.add(LakewoodHotel);
        hoteis.add(BridgewoodHotel);
        hoteis.add(RidgewoodHotel);       
        
        
        for (int i = 0; i<= hoteis.size() - 1; i++ ){
            Hotel hotelObj = hoteis.get(i); // recuperando um objeto do array
            
            if (valorMaisBaixo == null || valorMaisBaixo > hotelObj.getValorEstadia()){
                valorMaisBaixo = hotelObj.getValorEstadia();
                categoria = hotelObj.getClassificacaoHotel(); 
                nomeHotel = hotelObj.getNomeHotel();
            }else if(valorMaisBaixo == hotelObj.getValorEstadia()){
                     if(categoria < hotelObj.getClassificacaoHotel()){
                        categoria = hotelObj.getClassificacaoHotel(); 
                        nomeHotel = hotelObj.getNomeHotel();
                }
            }
        }
        return nomeHotel;
    }
}
        
        
        
        
    
    
