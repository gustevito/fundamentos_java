
/**
 * Faça um programa que leia o valor do raio, calcule e escreva a área de
 * uma esfera. A área de uma esfera é dada por a = 4πr2
 * 
 * @author Silvia
 * @version 14/03/2022
 */
import java.util.Scanner;
public class Exercicio4
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        double raio, area;
        
        System.out.print("Informe o valor do raio:");
        raio = teclado.nextDouble();
        area = 4 * Math.PI * Math.pow(raio,2);
        System.out.println("A área da esfera é " + area);
        
    }
}
