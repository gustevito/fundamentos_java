import java.util.Scanner;
public class Matriz{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[4][5];
        int i = 0;
        int j = 0;
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[i].length; j++){
                System.out.println("Insira um valor:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        
        // contador de linhas nulas
        int linhaN = 0;
        for(i = 0; i < matriz.length; i++){
            boolean linhasNulas = true;
            for(j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] != 0){
                    linhasNulas = false;
                    break;
                }
            }
            if (linhasNulas){
            linhaN++;
            }
        }
        
        // contador de colunas nulas
        int colunaN = 0;
        for(j = 0; j < matriz[0].length; j++){
            boolean colunasNulas = true;
            for(i = 0; i < matriz.length; i++){
                if (matriz[i][j] != 0){
                    colunasNulas = false;
                    break;
                }
            }
            if (colunasNulas){
            colunaN++;
            }
        }
        
        
        System.out.println("Quantidade de linhas nulas: " + linhaN);
        System.out.println("Quantidade de colunas nulas: " + colunaN);
    }
}