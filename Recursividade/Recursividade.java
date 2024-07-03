public class Recursividade{
    public static void main(String args[]){
        int nro = 5;
        
        System.out.println("Fatorial: " + fat(nro));
    }
    
    // o metodo de resolve sozinho em loop sem a necessidade de chamar o metodo mais de 1 vez
    public static int fat(int nro){ // 5 > 4 > 3 > 2 > 1 > 0
        if (nro == 0){ // se for 0, farotial de 0 == 1
            return 1;
        } else{ // enquanto nao for 0, ele vai repetir esse calculo
            return nro * fat(nro-1);
        }
    }
}