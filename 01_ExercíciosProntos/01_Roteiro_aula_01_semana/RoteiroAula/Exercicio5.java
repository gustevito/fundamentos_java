
/**
 * Escreva uma descrição da classe VolumeDaEsfera aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exercicio5
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        double raio,volume;
        
        System.out.print("\fDigite o valor do raio:");
        raio = teclado.nextDouble();
        volume = 4.0/3 * Math.PI * Math.pow(raio,3);
        System.out.println("O volume da esfera é " + volume);
    }
}