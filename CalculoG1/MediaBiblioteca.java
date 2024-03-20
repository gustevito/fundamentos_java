
/*
 * Escreva uma descrição da classe MediaBiblioteca aqui.
 * 
 * @gustavo
 * 1.0
 */

import java.util.Scanner;
public class MediaBiblioteca{
    public static void main(System args[]){
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
    
        System.out.println("Insira a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Insira a nota 2: ");
        nota2 = teclado.nextDouble();
        
        media = (nota1 + nota2)/2;

    }
    public static double calcMedia(double n1, double n2){
        
    }
}
