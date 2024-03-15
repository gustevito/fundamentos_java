
/**
 * Write a description of class Programa01 here.
 * 
 * @author Silvia
 * @version 04/03/2024
 */
import java.util.Scanner;
public class ProgramaComErroDeLogica02
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\fInforme o ano que você nasceu (usando 4 dígitos.ex: 1990): ");
        int ano = entrada.nextInt();
        System.out.println("Você tem (ou terá nos próximos meses) " + (2024 - ano) +  " anos.");
    }
}
