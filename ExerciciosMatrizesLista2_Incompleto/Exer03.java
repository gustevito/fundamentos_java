
/**
 * Dada uma matriz de n X m que armazena naturais maiores que zero. 
 * Escreva um programa que leia valores para a matriz, calcule a soma das colunas, armazenando o 
 * resultado em um vetor, e o produto das linhas, armazenando em outro vetor. 
 * Ao final escrever a matriz e os dois vetores.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer03
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int matriz[][] = new int[3][3];
        
        BibliotecaFinal.leMatriz(matriz, teclado);
        
        System.out.println ("Vetor com a soma das colunas ...");
        BibliotecaFinal.mostraVetor(BibliotecaFinal.vetorSomaColunas(matriz));
        System.out.println ("\nVetor com o produto das linhas ...");
        BibliotecaFinal.mostraVetor(BibliotecaFinal.vetorProdutoLinhas(matriz));
        
    }
    
}
