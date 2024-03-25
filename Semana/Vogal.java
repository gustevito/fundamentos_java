
import java.util.Scanner;
public class Vogal{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        char vogal;
        
        System.out.println("Informe uma letra para ver se ela e uma vogal ou consoante: ");
        vogal = teclado.next().charAt(0);
        switch (vogal){
            case 'a' | 'A': 
                System.out.println("Vogal");
                break;
            case 'e' | 'E':
                System.out.println("Vogal");
                break;
            case 'i' | 'I':
                System.out.println("Vogal");
                break;
            case 'o' | 'O':
                System.out.println("Vogal");
                break;
            case 'u' | 'U':
                System.out.println("Vogal");
                break;
                
            default:
                System.out.println("Consoante");
        }
    }
}