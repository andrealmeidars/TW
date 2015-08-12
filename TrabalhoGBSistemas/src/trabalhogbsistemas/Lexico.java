
package trabalhogbsistemas;


public class Lexico {
    
    private String codigo;
    private int pos;
    
    
    
    
    
    
    
    

    public Lexico(String codigo) {
        this.codigo = codigo;
        this.pos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Token proximoToken() {
        Token t = new Token();
        int estado = 0;
        int tam = codigo.length();
        char simbolo = ' ';
        String str = "";
        boolean continuar = true;
        boolean fim = false;
        while (true) {
            if (continuar && pos < tam) {
                simbolo = codigo.charAt(pos);
            } else if (pos == tam) {
                fim = true;
            }
            switch (estado) {
                case 0:
                    if (simbolo == ' ' || simbolo == '\t' || simbolo == '\n') {
                    } else if (simbolo == '+') {
                        estado = 1;
                        continuar = false;
                    } else if (simbolo == '-') {
                        estado = 2;
                        continuar = false;
                    } else if (simbolo == '*') {
                        estado = 3;
                        continuar = false;
                    } else if (simbolo == '/') {
                        estado = 4;
                        continuar = false;
                    } else if (simbolo == '&') {
                        estado = 5;
                        continuar = false;
                    } else if (simbolo == '|') {
                        estado = 6;
                        continuar = false;
                    } else if (simbolo == '!') {
                        estado = 7;
                    } else if (simbolo == '=') {
                        estado = 8;
                    } else if (simbolo == '>') {
                        estado = 9;
                    } else if (simbolo == '<') {
                        estado = 10;
                    } else if (simbolo == '(') {
                        estado = 11;
                    } else if (simbolo == ')') {
                        estado = 12;
                    } else if (Character.isLetter(simbolo)) {
                        estado = 13;
                        str += simbolo;
                    } else if (Character.isDigit(simbolo)) {
                        estado = 14;
                        str += simbolo;
                    } else {
                        estado = 100;
                        continuar = false;
                    }
                    break;
                case 1:
                    return new Token("+", "Operador Aritmético");
                case 2:
                    return new Token("-", "Operador Aritmético");
                case 3:
                    return new Token("*", "Operador Aritmético");
                case 4:
                    return new Token("/", "Operador Aritmético");
                case 5:
                    return new Token("&", "Operador Lógico");
                case 6:
                    return new Token("|", "Operador Lógico");
                case 7:
                    if (simbolo == '=') {
                        estado = 15;
                    } else {
                        estado = 16;
                    }
                    break;
                case 8:
                    if (simbolo == '=' && !fim) { //teste de fim por ser um token de dois simbolos iguais (==)
                        estado = 17;
                    } else {
                        estado = 18;
                    }
                    break;
                case 9:
                    if (simbolo == '=') {
                        estado = 19;
                    } else {
                        estado = 20;
                    }
                    break;
                case 10:
                    if (simbolo == '=') {
                        estado = 21;
                    } else {
                        estado = 22;
                    }
                    break;
                case 11:
                    return new Token("(", "Delimitador");
                case 12:
                    return new Token(")", "Delimitador");
                case 13:
                    if ((Character.isLetter(simbolo) || Character.isDigit(simbolo)) && !fim) {
                        str += simbolo;
                    } else {
                        estado = 23;
                    }
                    break;
                case 14:
                    if (Character.isDigit(simbolo) && !fim) {
                        str += simbolo;
                    } else if (simbolo == '.' && !fim) {
                        str += simbolo;
                        estado = 24;
                    } else if (Character.isLetter(simbolo) && !fim) {
                        str += simbolo;
                        estado = 28;
                    } else {
                        estado = 25;
                    }
                    break;
                case 15:
                    return new Token("!=", "Operador Relacional");
                case 16:
                    pos--;
                    return new Token("!", "Operador Lógico");
                case 17:
                    return new Token("==", "Operador Relacional");
                case 18:
                    pos--;
                    return new Token("=", "Atribuição");
                case 19:
                    return new Token(">=", "Operador Relacional");
                case 20:
                    pos--;
                    return new Token(">", "Operador Relacional");
                case 21:
                    return new Token("<=", "Operador Relacional");
                case 22:
                    pos--;
                    return new Token("<", "Operador Relacional");
                case 23:
                    pos--;
                    if (str.compareTo("if") == 0) {
                        return new Token(str, "Palavra Reservada");
                    } else {
                        //return new Token(str, "Identificador");
                        return new Token("id", "Identificador");
                    }
                case 24:
                    if (Character.isDigit(simbolo) && !fim) {
                        estado = 26;
                        str += simbolo;
                    } else if ((Character.isLetter(simbolo) || simbolo == '.')&& !fim) {
                        estado = 28;
                        str += simbolo;
                    }else {
                        estado = 100;
                    }
                    break;
                case 25:
                case 27:
                    pos--;
                    return new Token("num", "Número");
                case 26:
                    if (Character.isDigit(simbolo) && !fim) {
                        str += simbolo;
                    } else if ((Character.isLetter(simbolo) || simbolo == '.') && !fim) {
                        str += simbolo;
                        estado = 28;
                    } else {
                        estado = 27;
                    }
                    break;
                case 28:
                    if ((Character.isLetter(simbolo) || Character.isDigit(simbolo) || simbolo == '.') && !fim) {
                        str += simbolo;
                    } else {
                        pos--;
                        continuar = false;
                        estado = 100;
                    }
                    break;
                case 100:
                    if (str.length() > 0) {
                        return new Token(str, "Token não reconhecido");
                    } else {
                        return new Token(simbolo + "", "Token não reconhecido");
                    }
            }
            pos++;
        }
    }
    
}
