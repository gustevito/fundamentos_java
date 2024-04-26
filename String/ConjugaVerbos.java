import java.util.Scanner;

public class ConjugaVerbos{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo;
        boolean verifica;
    
        String verbo;
        
        
        System.out.println("    MENU DOS VERBOS    ");
        System.out.println("");
        System.out.println("Selecione uma opção para conjugar o verbo de uma palavra:");
        System.out.println("");
        System.out.println("    1 - Futuro     ");
        System.out.println("    2 - Presente     ");
        System.out.println("    3 - Passado     ");
        
        codigo = teclado.nextInt();
        switch (codigo){
            case 1:
                System.out.println("Digite um verbo para conjugá-lo no FUTURO:");
                verbo = teclado.next();
                
                verifica = BibliotecaStrings.verificaFim(verbo);
                if (verifica == true){
                    BibliotecaStrings.conjugaVerboFuturo(verbo);
                } else {
                    System.out.println("erro");
                }
            break;
            case 2:
                System.out.println("Digite um verbo para conjugá-lo no PRESENTE:");
                verbo = teclado.next();
                
                verifica = BibliotecaStrings.verificaFim(verbo);
                if (verifica == true){
                    BibliotecaStrings.conjugaVerboFuturo(verbo);
                } else {
                    System.out.println("erro");
                }
            break;
            default: System.out.println("ERRO!!");
        }
    }
}