import java.util.Scanner;
public class Matriz{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[4][5];
        
        System.out.println("Informe os numeros para compor uma matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}