import java.util.Scanner;
public class ProgramaComErroCompilacao09
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme o primeiro valor inteiro: ");
        int valor1 = entrada.nextInt();
        System.out.println("\fInforme o segundo valor inteiro: ");
        int valor2 = entrada.nextInt();
        System.out.println("Resultado da soma: " + (valor1+valor2));
    }
 
}
