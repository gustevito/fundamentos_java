
/**
 * verificações para armazenar os valores desejados: 
 * no máximo 72 elementos e a quantidade de elementos deve caber em uma matriz retangular
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer04
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner (System.in);
        int qtdeElementos, colunas, linhas;
        double colAux;

        // qtde máxima de valores armazenados -> 72 isto é, uma matriz 9X8
        // matriz retangular o nro de linhas deve ser diferente do nro de colunas
        do {
            System.out.println ("Qtde elementos: " );
            qtdeElementos = teclado.nextInt();

            colunas = BibliotecaFinal.maximoDivisorProprio(qtdeElementos);
            linhas =  qtdeElementos / colunas;

            System.out.println (" linhas " + linhas + " e Colunas " + colunas);

        }while (qtdeElementos < 0 || qtdeElementos > 72 || colunas == linhas);

        System.out.println (" Criando a matriz com linhas " + linhas + " e Colunas " + colunas);

        int matriz[][] = new int[linhas][colunas];

        BibliotecaFinal.leMatriz(matriz, teclado);

        // agora é a sua vez .... faça o que se pede na sequẽncia

        System.out.println ("Qtde pares: " + BibliotecaFinal.contPares(matriz));
        System.out.println ("Qtde ímpares: " + BibliotecaFinal.contImpares(matriz));
        System.out.println ("Qtde divi 11 " + BibliotecaFinal.contDivi (matriz, 11));
        System.out.println ("Qtde primos " + BibliotecaFinal.contPrimos (matriz));
        System.out.println ("Qtde perfeitos " + BibliotecaFinal.contPerfeitos (matriz));
        System.out.println ("Soma dos números linhas ímpares e colunas pares "
            + BibliotecaFinal.somaLinImpColPar(matriz));
        System.out.println ("Produto linhas pares " + BibliotecaFinal.prodLinhaPar (matriz));
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
        System.out.println ("Maior valor na linha do menor valor " + BibliotecaFinal.maiorValorLinhaMenor (matriz));
        BibliotecaFinal.mostraMatriz(matriz);
    }
    
}
