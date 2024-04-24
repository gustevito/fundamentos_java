import java.util.Scanner;

public class StringsMain{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int alternativa;
        String input;
        
        System.out.println("    MENU    ");
        System.out.println("");
        System.out.println("    1 - Quantidade de vogais de uma palavra   ");
        System.out.println("    2 - Inicia com 'por'?   ");
        System.out.println("    3 - Inicia com outro prefixo?   ");
        System.out.println("    4 - Termina com 'ar'?   ");
        System.out.println("    5 - Termina com outro prefixo?   ");
        System.out.println("    6 - Quantidade de prefixo 'in' na palavra   ");
        System.out.println("    7 - Ver as conjugaçoes de um verbo   ");
        
        alternativa = teclado.nextInt();
        switch (alternativa){
            case 1:
                input = teclado.nextLine();
            break;
            case 2:
            default: System.out.println("ERRO");
        }
    }
}