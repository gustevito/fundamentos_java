public class BibliotecaMultiplos{
    public static int qtdeMultiplos(int a, int b){
        int qtdD = 0;

        for (int cont = a; cont < b; cont++){
            if (cont % 3 == 0){
                qtdD++;
            }
        } return qtdD;
    }
    public static int somaDosPares(int a, int b){
        int qtdD = 0;
        
        for (int cont = a; cont < b; cont++){
            if (cont % 2 == 0){
               qtdD += cont; 
            }
        } return qtdD;
    }
}