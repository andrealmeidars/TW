
package trabalhogbsistemas;

import java.util.ArrayList;

/**
 * Trabalho consiste em eecutar um analisador léxico e sintático 
 * de um código fonte disponibilizado.
 * 
 * 
 * 
 * @author Andre Almeida
 *        
 */
public class AnaliseParse {
    private Pilha pilha; // acesso Pilha
    private String topoPilha; // var para armazenar o topo da pilha
    private String tokenAtual; // var para armazenar o token atual
    private boolean encontrouErro; // boolean caso encontre erro
    private int contadorAcessoTabela = 0;// contador de acesso na tabela
    private ArrayList<Token> tokensValidos = new ArrayList<>(); // array de tokens válidos
    
    
    public AnaliseParse (ArrayList<Token> arrayTokens) {
        this.pilha = new Pilha();
        this.tokensValidos = arrayTokens;        
        Token finalToken = new Token("$", "ultimo"); // add o $ no fim dos tokens válidos
        tokensValidos.add(finalToken);
    }
    
    public void codigoParser(){        
        Tabela tabela = new Tabela(); // acesso à tabela
        Erro erro = new Erro();// acesso à classe erro  
        encontrouErro = false;        
        int controladorIndiceArrayTokens = 0; // controladora de indice de token para recuperar valor
        
        // adicionando e recuperado dados de pilha
        this.pilha.adicionaNaPilha("$"); // add $ na pilha
        this.pilha.adicionaNaPilha("S"); // add S na na pilha
        this.topoPilha = this.pilha.retornaTopoPilha(); // recupera topo da pilha
      
        
        this.tokenAtual = tokensValidos.get(controladorIndiceArrayTokens).getValor(); // pega primeiro token
        //System.out.println("Valor atual do token: " + tokenAtual); // teste para ver o token escolhido
        
        while(topoPilha != "$") {            
            
            this.topoPilha = pilha.retornaTopoPilha(); // pega o topo da pilha
            
                if(tabela.tokTerminal(topoPilha) == true || topoPilha.equals("$")){
                   if(topoPilha.equals(tokenAtual)){
                      pilha.removeDaPilha();
                      
                      if (controladorIndiceArrayTokens <= tokensValidos.size()- 2){
                            controladorIndiceArrayTokens = controladorIndiceArrayTokens + 1; // incrementa contador
                            tokenAtual = tokensValidos.get(controladorIndiceArrayTokens).getValor(); // avança a fita
                        //System.out.println("VALOR DE TOKEN VALIDO ATUAL: " + tokenAtual);
                    }
         
                    }else { // inicio do erro caso não tenha entrada na tabela
                       erro.setErro("ERRO! VALOR DE " + topoPilha + " NÃO CORRESPONDE AO TOKEN " + tokenAtual );
                       erro.imprimeErro();
                       encontrouErro  = true;
                       topoPilha = "$"; // para sair do while
                       
                }// fim do erro 1
                
                } else if (tabela.retornarValorTabela(topoPilha, tokenAtual) !=  "##" ){
                    String producao = tabela.retornarValorTabela(topoPilha, tokenAtual);
                    this.contadorAcessoTabela = contadorAcessoTabela + 1;                    
                    pilha.removeDaPilha();
                    
                        // se a producao tiver vazio, nao empilha
                        if (producao != "vazio"){
                            pilha.adicionaNaPilha(producao);
                        }
                    
                   
                }else {
                    erro.setErro("ERRO! NÃO  FOI ENCONTRADO OS VALORES " + topoPilha +" X " + tokenAtual + " NA TABELA.");
                    erro.imprimeErro();
                    encontrouErro  = true;                    
                    topoPilha = "$"; // para sair do while
                    
                }// fim do erro 2               
       }//fim do while
               
        
        if (encontrouErro){
            System.out.println("CÓDIGO INVÁLIDO");           
        }else if (this.topoPilha.equals("$") && this.tokenAtual.equals("$")){
            System.out.println(" CÓDIGO VÁLIDO");
            System.out.println("O SISTEMA ACESSOU " + contadorAcessoTabela + " VEZES A TABELA");
        }
        

    
    
    
    
    }
}
