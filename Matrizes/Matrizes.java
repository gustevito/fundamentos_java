import java.util.Scanner;
public class Matrizes{
    public static void main (String args[]){
        double matriz[][] = new double [3][3];
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){ // for da linha
            for (int j = 0; j < 3; j++){ // for da coluna
                System.out.println("Informe os valores: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }
        
        System.out.println("Matriz: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " | ");   
            }
            System.out.println();
        } 
    }
}