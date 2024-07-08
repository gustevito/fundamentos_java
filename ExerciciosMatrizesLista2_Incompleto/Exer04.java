
/**
 * Dada uma matriz de ordem 4: 
 * (a) mostrar quantos números pares estão armazenados acima da diagonal principal; 
 * (b) mostrar quantos números ímpares estão armazenados abaixo da diagonal principal
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer04
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner (System.in);
        int matriz[][] = new int[3][3];
        
        BibliotecaFinal.leMatriz(matriz, teclado);
        
        System.out.println ("Qtde pares acima da DP: " + BibliotecaFinal.paresAcimaDP(matriz));
        System.out.println ("Qtde ínpares abaixo da DP: " + BibliotecaFinal.imparesAbaixoDP(matriz));
    }
}
