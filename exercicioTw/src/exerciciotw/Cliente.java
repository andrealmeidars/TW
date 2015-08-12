/*
 * Código Desenvolvido por André Almeida - Sistemas de Informação / UniRitter 2015
 * Fornecido para ThoughtWorks - 01/05/2015 
 * Mail :andre.almeida@msn.com 
 */
package exerciciotw;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author André Almeida - 01/05/2015 - Fornecido para ThoughtWorks
 */
public class Cliente {
    private String tipoDoClienteSelecionado = "";
    
    public Cliente(){
    }
    
    public String retornaTipoCliente(){
        
        System.out.println("SISTEMA ONLINE DE RESERVA:");
        System.out.println("-------------------------:");
        System.out.println("ESCOLHA O TIPO DE CLIENTE");
        System.out.println("1 = REGULAR");
        System.out.println("2 = REWARDS");
        System.out.println("-------------------------");
        Scanner tipoCliente = new Scanner(System.in);
        String nivelCliente = tipoCliente.nextLine();
        
        
       switch(nivelCliente) {
           case "1":
               System.out.println("Tipo Cliente Selecionado : REGULAR");
               System.out.println("----------------------------------");
               this.tipoDoClienteSelecionado = "REGULAR";
           break;
            
            case "2":
               System.out.println("Tipo Cliente Selecionado : REWARDS"); 
               System.out.println("----------------------------------");
               this.tipoDoClienteSelecionado = "REWARDS";
            break;
                
            default:
                System.out.println("Nivel de Cliente Incorreto - Tente novamente");
                System.out.println("PROGRAMA ENCERRADO");
                System.out.println("---------------------------------------------");
                System.exit(0);
            break;
            }
        return tipoDoClienteSelecionado;
        }
    
    
}
