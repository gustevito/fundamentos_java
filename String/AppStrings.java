import java.util.Scanner;

public class AppStrings{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int alternativa;
        int vogais;
        int infixos;
        boolean verifica;
        
        String prefixo;
        String sufixo;
        String palavra;
        
        System.out.println("    MENU    ");
        System.out.println("");
        System.out.println("    1 - Quantidade de vogais de uma palavra   ");
        System.out.println("    2 - Inicia com 'por'?   ");
        System.out.println("    3 - Inicia com outro prefixo?   ");
        System.out.println("    4 - Termina com 'ar'?   ");
        System.out.println("    5 - Termina com outro sufixo?   ");
        System.out.println("    6 - Quantidade de infixo 'in' na palavra   ");
        
        
        alternativa = teclado.nextInt();
        switch (alternativa){
            case 1:
                teclado.nextLine();
                System.out.println("Digite uma palavra/frase para descobrir a quantidade de VOGAIS presentes nela:");
                palavra = teclado.nextLine();
                
                vogais = BibliotecaStrings.vogais(palavra);
                System.out.println("Esta palavra/frase possui " + vogais + " vogais.");
            break;
            case 2:
                teclado.nextLine();
                System.out.println("Digite uma palavra para descobrir se ela se inicia com o prefixo 'por':");
                palavra = teclado.nextLine();
                
                verifica = BibliotecaStrings.verficaInicio(palavra);
                System.out.println("'" + palavra + "' inicia com o prefixo 'por': " + verifica);
            break;
            case 3:
                System.out.println("Digite um prefixo:");
                prefixo = teclado.next();
                System.out.println("Digite uma palavra para descobrir se ela se inicia com o prefixo '" + prefixo + "'");
                palavra = teclado.nextLine();
                
                verifica = BibliotecaStrings.verificaInicioInput(palavra, prefixo);
                System.out.println("'" + palavra + "' inicia com o prefixo: " + verifica);
            break;
            case 4:
                System.out.println("Digite uma palavra para descobrir se ela termina com o sufixo 'ar':");
                palavra = teclado.next();
                
                verifica = BibliotecaStrings.verificaFim(palavra);
                System.out.println("'" + palavra + "' termina com o sufixo 'ar': " + verifica);
            break;
            case 5:
                System.out.println("Digite um sufixo:");
                sufixo = teclado.next();
                System.out.println("Digite uma palavra para descobrir se ela termina com o sufixo '" + sufixo + "'");
                palavra = teclado.next();
                
                verifica = BibliotecaStrings.verificaFimInput(palavra, sufixo);
                System.out.println("'" + palavra + "' termina com o sufixo: " + verifica);
            break;
            case 6:
                System.out.println("Digite uma palavra/frase para descobrir a quantidade de infixos 'in' nela:");
                palavra = teclado.next();
                
                infixos = BibliotecaStrings.verificaQuantidadeDeIn(palavra);
                System.out.println("Esta palavra/frase possui " + infixos + " infixos 'in'.");
            break;
        }
    }
}