import java.util.Scanner;
public class Exerc01
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int matriz[][] = new int[3][3];
        
        BibliotecaFinal.leMatriz(matriz, teclado);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");    
            } System.out.println();
        }
        
        System.out.println ("Soma DP com 2 FOR " + BibliotecaFinal.somaDP2For (matriz));
        System.out.println ("Soma DP com 1 FOR " + BibliotecaFinal.somaDP1For (matriz));
    }
}