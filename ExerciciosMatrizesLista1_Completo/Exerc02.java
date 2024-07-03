
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
        Scanner teclado = new Scanner (System.in);
        int matriz[][] = new int[3][3];
        
        BibliotecaFinal.leMatriz(matriz, teclado);
        
        BibliotecaFinal.mostraVetor(BibliotecaFinal.criaVetor (matriz));
        
    }
}
