
package trabalhogbsistemas;


public class Tabela {    
    private String ERRO = "ERRO! NÃO FOI ENCONTRADO O VALOR NA TABELA ENTRE  ";
    Erro erroTabela = new Erro();
    
   public Tabela(){
   }
   
   
   public void relataErro(String variavel_x, String variavel_y){
       erroTabela.setErro(ERRO + variavel_x  + " X " + variavel_y);
    }
   
   // retorna o valor na tabela
   public String retornarValorTabela(String variavel, String producao ) {
       String retornoValorTabela = " ";
       
   
       switch(variavel) {
       
            case "S":
                   switch(producao) {
                       case "if" :  retornoValorTabela = "A ) B ( if"; break;
                       default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                   }
            break;

            case "A":
                   switch(producao) {
                       case "id" :  retornoValorTabela = "E = id"; break;
                       default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                   }
            break;    

            case "E":
                   switch(producao) {
                        case "id": retornoValorTabela = "E' T"; break;
                        case "num": retornoValorTabela = "E' T"; break;
                        case "(": retornoValorTabela = "E' T"; break;    
                        case "-": retornoValorTabela = "E' T"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                   }
            break; 

            case "E'": 
                    switch(producao){
                        case ")": retornoValorTabela = "vazio"; break;
                        case "+": retornoValorTabela = "E' T +"; break;
                        case "-": retornoValorTabela = "E' T -"; break;
                        case "&": retornoValorTabela = "vazio"; break;
                        case "|": retornoValorTabela = "vazio"; break;
                        case "==": retornoValorTabela = "vazio"; break;
                        case ">": retornoValorTabela = "vazio"; break;
                        case ">=": retornoValorTabela = "vazio"; break;
                        case "<": retornoValorTabela = "vazio"; break;
                        case "<=": retornoValorTabela = "vazio"; break;
                        case "!=": retornoValorTabela = "vazio"; break;
                        case "$": retornoValorTabela = "vazio"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 

            case "T": 
                    switch(producao){
                        case "id": retornoValorTabela = "T' F"; break;
                        case "num": retornoValorTabela = "T' F"; break;
                        case "(": retornoValorTabela = "T' F"; break;
                        case "-": retornoValorTabela = "T' F"; break;            
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break;


            case "T'": 
                    switch(producao){
                        case ")": retornoValorTabela = "vazio"; break;
                        case "+": retornoValorTabela = "vazio"; break;
                        case "-": retornoValorTabela = "vazio"; break;
                        case "*": retornoValorTabela = "T' F *"; break;
                        case "/": retornoValorTabela = "T' F /"; break;
                        case "&": retornoValorTabela = "vazio"; break;
                        case "|": retornoValorTabela = "vazio"; break;
                        case "==": retornoValorTabela = "vazio"; break;
                        case ">": retornoValorTabela = "vazio"; break;
                        case ">=": retornoValorTabela = "vazio"; break;
                        case "<": retornoValorTabela = "vazio"; break;
                        case "<=": retornoValorTabela = "vazio"; break;
                        case "!=": retornoValorTabela = "vazio"; break;
                        case "$": retornoValorTabela = "vazio"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 

            case "F": 
                    switch(producao){
                        case "id": retornoValorTabela = "G"; break;
                        case "num": retornoValorTabela = "G"; break;
                        case "(": retornoValorTabela = "G"; break;
                        case "-": retornoValorTabela = "G -"; break;            
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 


            case "G": 
                switch(producao){
                        case "id": retornoValorTabela = "id"; break;
                        case "num": retornoValorTabela = "num"; break;
                        case "(": retornoValorTabela = ") E ("; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break;


            case "B": 
                    switch(producao){
                        case "id": retornoValorTabela = "B' J"; break;
                        case "num": retornoValorTabela = "B' J"; break;
                        case "(": retornoValorTabela = "B' J"; break;
                        case "-": retornoValorTabela = "B' J"; break;
                        case "!": retornoValorTabela = "B' J"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break;   


            case "B'": 
                    switch(producao){
                        case ")": retornoValorTabela = "vazio"; break;
                        case "|": retornoValorTabela = "B' J |"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break;   

           case "J": 
                    switch(producao){
                        case "id": retornoValorTabela = "J' K"; break;
                        case "num": retornoValorTabela = "J' K"; break;
                        case "(": retornoValorTabela = "J' K"; break;
                        case "-": retornoValorTabela = "J' K"; break;
                        case "!": retornoValorTabela = "J' K"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 


            case "J'": 
                    switch(producao){
                        case ")": retornoValorTabela = "vazio"; break;
                        case "&": retornoValorTabela = "J' K &"; break;
                        case "|": retornoValorTabela = "vazio"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 

            case "K": 
                    switch(producao){
                        case "id": retornoValorTabela = "L"; break;
                        case "num": retornoValorTabela = "L"; break;
                        case "(": retornoValorTabela = "L"; break;
                        case "-": retornoValorTabela = "L"; break;
                        case "!": retornoValorTabela = "L !"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 

            case "L": 
                    switch(producao){
                        case "id": retornoValorTabela = "E O E"; break;
                        case "num": retornoValorTabela = "E O E"; break;
                        case "(": retornoValorTabela = "E O E"; break;
                        case "-": retornoValorTabela = "E O E"; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                   }
            break; 

            case "O": 
                    switch(producao){
                        case "==": retornoValorTabela = "=="; break;
                        case ">": retornoValorTabela = ">"; break;
                        case ">=": retornoValorTabela = ">="; break;
                        case "<": retornoValorTabela = "<"; break;
                        case "<=": retornoValorTabela = "<="; break;
                        case "!=": retornoValorTabela = "!="; break;
                        default: relataErro(variavel, producao);
                                retornoValorTabela = "##"; break;
                    }
            break; 
        }// fim do switch "variavel"
    
    return retornoValorTabela;       
   }
   
   
   // retorna se o token é terminal ou nao
   public boolean tokTerminal (String token) {
       
       switch (token){
           case "if" : case "id" : case "num" : case "(" : case ")" : case "+" : case "-" : case "*" :   case "/" : case "=" : case "&" :   case "|" : case "!" :  case "==" : case ">" : case ">=" :  case "<" : case "<=" : case "!=" : case "$" : 
           return (true); 
               
            default: return (false);
       }
    }
   }
