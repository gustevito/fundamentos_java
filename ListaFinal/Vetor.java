import java.util.Scanner;
public class Vetor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int nro = 10;
        int vetor[] = new int[nro];
        int i; // 1º numero
        
        System.out.println("Informe 10 numeros que serão inseridos em sua lista:");
        for (i = 0; i < vetor.length; i++){
            vetor[i] = teclado.nextInt();
        }
        
        
    }
}