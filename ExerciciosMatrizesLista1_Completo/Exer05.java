
/**
 * verificações para armazenar os valores desejados: 
 * no máximo 72 elementos e a quantidade de elementos deve caber em uma matriz retangular
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer05
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner (System.in);
        int qtdeElementos, colunas, linhas;
        double colAux = 0;

        // qtde máxima de valores armazenados -> 81 isto é, uma matriz 9X9
        // matriz quadrada o nro de linhas deve ser igual ao nro de colunas
        do {
            System.out.println ("Qtde elementos: " );
            qtdeElementos = teclado.nextInt();
            
            colAux = Math.sqrt(qtdeElementos);
                        
            System.out.println (" colAuxiliar: " + colAux);
            
        }while (qtdeElementos < 0 || qtdeElementos > 81 || colAux * colAux != qtdeElementos);
        
        linhas = colunas = (int) colAux;
        
        System.out.println (" Criando a matriz com linhas " + linhas + " e Colunas " + colunas);
        int matriz[][] = new int[linhas][colunas];
        BibliotecaFinal.leMatriz(matriz, teclado);

        // agora é a sua vez .... faça o que se pede na sequẽncia

        System.out.println ("Soma DP " + BibliotecaFinal.somaDP (matriz));
        System.out.println ("Produto DS " + BibliotecaFinal.produtoDS (matriz));
        BibliotecaFinal.mostraMatriz(matriz);
        
        BibliotecaFinal.troca(matriz);
        System.out.println ("Depois da troca .... ");
        BibliotecaFinal.mostraMatriz(matriz);
 
        System.out.println ("Qtde perfeitos " + BibliotecaFinal.contPerfeitos (matriz));
        System.out.println ("Soma dos números linhas ímpares " + BibliotecaFinal.somaLinImpares(matriz));
        System.out.println ("Produto dos números linhas pares e colunas ímpares "
            + BibliotecaFinal.produtoLinParColImpar(matriz));
        
        if (BibliotecaFinal.mediaValores(matriz, 1) > BibliotecaFinal.mediaValores(matriz,2))
        {
            System.out.println ("Media valores pares é maior que a media de valores impares ");
        }
        else
        {
            if (BibliotecaFinal.mediaValores(matriz, 2) > BibliotecaFinal.mediaValores(matriz,1))
            {
                System.out.println ("Media valores impares é maior que a media de valores pares ");
            }
            else
            {
                System.out.println ("Media valores impares é igual a media de valores pares ");
            }
        }
        
        BibliotecaFinal.mostraMatriz(matriz);
    }
    
}
