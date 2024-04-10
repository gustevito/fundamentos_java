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
        boolean ehNumeroP = false;
        int qtdD = 0;
        
        for (int cont = 1; cont <= x; cont++){
            if ( x % cont == 0){
                qtdD = qtdD + cont;
            }
            
            if ( qtdD == x) {
                ehNumeroP = true;
            } else{
                ehNumeroP = false;
            }
        } 
        return ehNumeroP;
    }
}
    /*public static int ehNumeroAbundante(int x){
        
    }
    
    public static int ehNumeroCapicua(int x){
        
    }
    
    public static int saoAmigos(int x, int y){
        
    }
}*/