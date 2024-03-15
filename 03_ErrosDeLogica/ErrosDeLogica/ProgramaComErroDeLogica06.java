
/**
 * Write a description of class ProgramaComErroDeLogica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProgramaComErroDeLogica06
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();
        // linhas sobrando
        System.out.println("Informe o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();

        double media = (valor1 + valor2) / 2;
        System.out.println("Média Aritmética: " + media);
    }

}
