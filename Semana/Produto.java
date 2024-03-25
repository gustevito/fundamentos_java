
import java.util.Scanner;
public class Produto{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo;
        
        System.out.println("Informe um numero de 1 a 4 para ver a classificaçao do produto: ");
        codigo = teclado.nextInt();
        switch (codigo){
            case 1: 
                System.out.println("Alimento nao perecivel");
                break;
            case 2:
                System.out.println("Alimento perecivel");
                break;
            case 3:
                System.out.println("Vestuario");
                break;
            case 4:
                System.out.println("Limpeza");
                break;
            default:
                System.out.println("ERRO! Informe um numero de 1 a 4!");
        }
    }
}