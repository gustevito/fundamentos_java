
/**
 * Write a description of class ProgramaComErroDeLogica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProgramaComErroDeLogica08
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int valor1, valor2;
        
        System.out.println("\fInforme o primeiro valor inteiro: ");
        valor1 = entrada.nextInt();
       
        System.out.println("Informe o segundo valor inteiro: ");
        valor2 = entrada.nextInt();
        
        double media = (valor1 + valor2) / 2;
        
        System.out.println("Média Aritmética: " + media);
    }

}
