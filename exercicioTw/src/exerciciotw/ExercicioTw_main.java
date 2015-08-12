/*
 * Código Desenvolvido por André Almeida - Sistemas de Informação / UniRitter 2015
 * Fornecido para ThoughtWorks - 01/05/2015 
 * Mail :andre.almeida@msn.com 
 */
package exerciciotw;

import java.util.Scanner;

/**
 *
 * @author André Almeida - 01/05/2015 - Fornecido para ThoughtWorks
 */
public class ExercicioTw_main {

        
    public static void main(String[] args) {
        String tipoDoCliente = ""; // armazena o tipo do cliente selecionado
        String diaSemana1 = ""; // armazena o primeiro valor para o dia da semana
        String diaSemana2 = ""; // armazena o segundo valor para o dia da semana
        String diaSemana3 = ""; // armazena o terceiro valor para o dia da semana
        
        // instanciando classes
        DiaSemana diaSemana = new DiaSemana(); //dias da semana
        Cliente novoCliente = new Cliente();  // clientes
        Estadia estadia = new Estadia(); // estadia
        
       
        // Lê o teclado e retorna o tipo de Cliente (Regular - Rewards)
       tipoDoCliente = novoCliente.retornaTipoCliente();
       
      
       // Lê o teclado e retorna os dias da semana
       System.out.println("--------------------------");
       System.out.println("PRIMEIRO DIA DE ESTADIA: ");
       diaSemana1 = diaSemana.escolheData();
       
       System.out.println("--------------------------");
       System.out.println("SEGUNDO DIA DE ESTADIA: ");
       diaSemana2 = diaSemana.escolheData();
       
       System.out.println("--------------------------");
       System.out.println("TERCEIRO DIA DE ESTADIA: ");
       diaSemana3 = diaSemana.escolheData();
              
      
      
       // envia os valores para ser analisado pela classe
       System.out.println("Hotel Indicado : " + estadia.retornarHotel(tipoDoCliente, diaSemana1, diaSemana2, diaSemana3));
   }
}
