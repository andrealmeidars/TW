
package trabalhogbsistemas;

import java.util.ArrayList;

public class Pilha {    
    private ArrayList<String> pilha = new ArrayList<>();
    
    // recebe producao, divide em partes, coloca no array, e  adiciona na pilha    
    public void adicionaNaPilha(String valor){
        String[] arrayProducao = valor.split(" ");
        
        for(String producao : arrayProducao) {                
            this.pilha.add(producao);
            }
        }
    
     public void removeDaPilha(){        
        pilha.remove(pilha.size() - 1);        
    }
    
    
    public String retornaTopoPilha(){
        return this.pilha.get(this.pilha.size()- 1);
    }
}
