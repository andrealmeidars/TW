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
public class DiaSemana {
    private String diaSemanaEscolhido;
    private String diaDaSemana = "";
    
    
    public DiaSemana(){
    }
    
    //método para ler o dia da semana
      public String escolheData(){            
            
            System.out.println("-------------------------:");
            System.out.println("ESCOLHA O DIA DA SEMANA:");
            System.out.println("1 = Sunday");
            System.out.println("2 = Monday");
            System.out.println("3 = Tuesday");
            System.out.println("4 = Wednesday");
            System.out.println("5 = Thursday");
            System.out.println("6 = Friday");
            System.out.println("7 = Saturday");
            
            Scanner diaSemana = new Scanner(System.in);
            this.diaDaSemana = diaSemana.nextLine();
            
            switch(diaDaSemana) {
                    case "1":               
                       this.diaSemanaEscolhido = "sun";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: SUNDAY");
                       System.out.println("-------------------------------");
                    break;

                    case "2":               
                       this.diaSemanaEscolhido = "mon";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: MONDAY");
                       System.out.println("-------------------------------");
                    break;

                    case "3":               
                       this.diaSemanaEscolhido = "tues";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: TUESDAY");
                       System.out.println("-------------------------------");
                    break;    

                    case "4":               
                       this.diaSemanaEscolhido = "wed";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: WEDNESDAY");
                       System.out.println("----------------------------------");
                    break;    

                    case "5":               
                       this.diaSemanaEscolhido = "thur";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: THURSDAY");
                       System.out.println("---------------------------------");
                    break;

                    case "6":               
                       this.diaSemanaEscolhido = "fri";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: FRIDAY");
                       System.out.println("-------------------------------");
                    break;

                    case "7":               
                       this.diaSemanaEscolhido = "sat";
                       System.out.println("DIA DA SEMANA ESCOLHIDO: SATURDAY");
                       System.out.println("----------------------------------");
                    break;    


                    default:
                        System.out.println("Dia da Semana Incorreto - Tente novamente");
                        System.out.println("PROGRAMA ENCERRADO!");
                        System.out.println("-----------------------------------------");
                        System.exit(0);
                        break;
                    }
        return diaSemanaEscolhido;    
        }
    }
