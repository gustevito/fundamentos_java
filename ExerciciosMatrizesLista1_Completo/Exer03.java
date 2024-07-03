
/**
 * Criar um método que recebe um vetor qualquer e cria uma matriz (criaMatriz), retornando-a.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer03
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int vetor[] = new int[16];
        
        BibliotecaFinal.leVetor ("Vetor ", vetor, teclado);
        
        BibliotecaFinal.mostraMatriz(BibliotecaFinal.criaMatriz(vetor));
        
    }
    
}
