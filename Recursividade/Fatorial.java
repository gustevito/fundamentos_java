public class Fatorial{
    public static void main(String args[]){
        int nro = 5;
        int fat = 1;
        
        while(nro >= 1){
            fat *= nro;
            nro--;
        }
        System.out.println("Fatorial: " + fat);
    }
}