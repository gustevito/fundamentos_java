import java.util.Scanner;
public class Matrizes{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int matriz[][] = new int[5][6];
        
        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 6; coluna++){
                System.out.println("Insira um valor: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }
        
        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 6; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}