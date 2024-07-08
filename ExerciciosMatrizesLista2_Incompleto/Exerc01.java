
/**
 * Elaborar um programa que leia um vetor com 10 números inteiros e informar se se existem dois 
 * elementos dentro dele que multiplicados dão um outro elemento do vetor
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exerc01
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int vetor[] = new int[10];
        
        BibliotecaFinal.leVetor("Vetor inteiros ...", vetor, teclado);
        
        if (BibliotecaFinal.existeProduto(vetor)){
           System.out.println ("Existe produto de dois elementos armazenados...." ); 
        }
        else
        {
            System.out.println ("NÃO existe produto de dois elementos armazenados....");
        }
        
    }
}