
/**
 * A partir de uma matriz, cria-se um vetor.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exerc02
{
    public static void main (String args[]){
        
        int matriz[][] = new int[3][3];
        
        leMatriz ("Matriz ", matriz);
        
        mostraVetor(criaVetor (matriz));
        
    }
    public static void leMatriz (String nome, int matriz[][])
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Lendo matriz:" );
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j=0; j < matriz[i].length; j++)
            {
                matriz[i][j] = teclado.nextInt();
            }
        }
        
    }
    public static int [] criaVetor (int matriz[][])
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;     
        int vetor [] = new int [linhas*colunas];
        int indV = 0;
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                 vetor[indV] = matriz[i][j];
                 indV++;
            }
        }
        
        return vetor;
    }
    public static void mostraVetor(int vetor[])
    {
        System.out.println ("mostrando vetor: ");
        for (int i = 0; i<vetor.length; i++){
            System.out.print (vetor[i]);
        }
    }



}
