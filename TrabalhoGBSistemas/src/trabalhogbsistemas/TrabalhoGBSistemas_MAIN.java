
package trabalhogbsistemas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TrabalhoGBSistemas_MAIN {

   
    public static void main(String[] args) {
        
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Arquivo/testelexico0.txt"));
            StringBuilder sb = new StringBuilder();
            String linha = br.readLine();
            while (linha != null) {
                linha = linha.trim();
                sb.append(linha);
                linha = br.readLine();
                }
            String codigo = sb.toString();
            br.close();

            Lexico lex = new Lexico(codigo);
            ArrayList<Token> tokens = new ArrayList<>();
            while (lex.getPos() < codigo.length()) {
                tokens.add(lex.proximoToken());
                
            }
           

            AnaliseParse analise = new AnaliseParse(tokens); // envia  o array para analise
            analise.codigoParser(); // faz a analise do parser
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arq. não encontrado");
        } catch (IOException ex) {
            System.out.println("Erro de I/O");
        }
        
      
        
        
        
        
        
      
    }
    
}
