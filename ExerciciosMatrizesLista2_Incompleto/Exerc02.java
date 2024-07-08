
/**
 * Elaborar um programa que leia uma matriz n X m e 
 * mostrar a quantidade de linhas e colunas nulas da matriz�.
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
        
        System.out.println ("Quantidade de linhas NULAS " + BibliotecaFinal.linhasNulas (matriz));
        System.out.println ("Quantidade de colunas NULAS " + BibliotecaFinal.colunasNulas (matriz));
    }
}
