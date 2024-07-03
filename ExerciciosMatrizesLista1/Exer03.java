
/**
 * Criar um método que recebe um vetor qualquer e cria uma matriz (criaMatriz), retornando-a.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer03
{
    public static void main (String args[]){
        
        int vetor[] = new int[16];
        
        leVetor ("Vetor ", vetor);
        
        mostraMatriz(criaMatriz(vetor));
        
    }
    public static void leVetor (String nome, int vetor[])
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Lendo vetor:" );
        
        for (int i = 0; i < vetor.length; i++) 
        {
                vetor[i] = teclado.nextInt();
        }
        
    }
    public static void mostraMatriz (int matriz[][])
    {   
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j=0; j < matriz[i].length; j++)
            {
                System.out.print (matriz[i][j] + " ");
            }
            System.out.println ();
        }
        
        
    }
    // calcula o nro de colunas a partir da raiz quadrada, pegando o próximo nro
    // calcula o nro de linhas a partir da qtde de elementos a serem armazenados, dividindo pelo nro de colunas
    // há a possibilidade de ter mais espaços na matriz do que elementos no vetor, por isso
    // a necessidade de controlar a quantidade de elementos do vetor que serão armazenados na matriz.
    public static int [][] criaMatriz(int vetor[])
    {
        int qtdeElementos = vetor.length; // guarda qtde de elementos na variável auxiliar
        
        // qtde de colunas é o arredondamento para o próximo valor maior que a raiz quadrada do nro
        // Math.sqrt => retorna um double
        // Math.ceil => recebe um double e devolve um double
        int colunas = (int) Math.ceil(Math.sqrt(vetor.length)); 
        // qtde de linhas é o arredondamento para o próximo valor maior do resultado da divisão
        // da quantidade de elementos pelo número de collunas 
        int linhas = (int) Math.ceil((double) vetor.length / colunas);
        
        System.out.println ("Linhas " + linhas + " colunas  " + colunas);
        int matriz[][] = new int [linhas][colunas];
        int cont = 0;
        
        for(int i = 0; i < linhas; i++)
        {
            for(int j = 0; j < colunas; j++)
            {
                if (qtdeElementos > 0) {  // se ainda tem elemento no vetor, guarda ele
                    matriz[i][j] = vetor[cont]; 
                    cont++;
                    qtdeElementos--;
                }
            }
        }
        
        return matriz;
        
    }
    // quando se quer criar uma matriz com um nro certo de  linhas e colunas
    // para isso tem que garantir que o tamanho do vetor seja igual a 
    // linha * coluna sugeridas
    public static int[][] jogaNaMatriz(int[] vetor, int linha, int coluna)
    {   
        int matriz[][] = new int[linha][coluna];
        int aux=0;
        for (int i = 0;i<linha;i++)
        {
            for(int j = 0;j<coluna;j++)
            {
                matriz[i][j] = vetor[aux];
                aux++;
            }
            
        }
        
        return matriz;
        
    }

}
