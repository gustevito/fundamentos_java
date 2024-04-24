public class BibliotecaDivisores{
    public static int qtdeDivisores(int x){
        int qtdD = 0;
        
        for (int cont = 1; cont <= x; cont++){
            if ( x % cont == 0) {
                qtdD++;
            }
        } return qtdD;
    }
    
    public static boolean ehPrimo(int x){ // um numero primo so pode ser divisivel por 2 inteiros: 1, e ele mesmo (qtd. de divisores = 2)
        boolean ehP = false;
        int qtdD = 0;
        
        qtdD = qtdeDivisores(x);
        
        if (qtdD == 2){
            ehP = true;            
        } else{
            ehP = false;
        }
        return ehP;
    }

    public static boolean ehNumeroPerfeito(int x){
        if (x <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma == x;
    }

    public static boolean ehNumeroAbundante(int x){
        if (x <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma > x;
    }
    public static boolean ehCapicua(int x) {
        // conversao do número para uma string para facilitar a análise
        String numStr = String.valueOf(x);
        
        // obter comprimento da string
        int length = numStr.length();
        
        for (int i = 0; i < length / 2; i++) {
            // comparando caracteres correspondentes da esquerda e da direita
            if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
                // se houver uma diferença, não é capicua
                return false;
            }
        }
        return true;
    }
    public static boolean saoAmigos(int x, int y){
            if (x <= 0 && y <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma == x;
    }
}