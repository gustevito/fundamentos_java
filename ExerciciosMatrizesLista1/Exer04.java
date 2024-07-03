
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
            
            colunas = maximoDivisorProprio(qtdeElementos);
            linhas =  qtdeElementos / colunas;
            
            System.out.println (" linhas " + linhas + " e Colunas " + colunas);
            
        }while (qtdeElementos < 0 || qtdeElementos > 72 || colunas == linhas);
    
        System.out.println (" Criando a matriz com linhas " + linhas + " e Colunas " + colunas);
        
        // agora é a sua vez .... faça o que se pede na sequẽncia
    }
    public static int maximoDivisorProprio(int numero) 
    {
        int mdc = 1;

        for (int i = 1; i <= numero / 2; i++) { // máximo divisor próprio
            System.out.println (" numero " + numero + " i " + i);
            if (numero % i == 0) 
            {
                mdc = i;
                System.out.println (" MDC " + mdc);
            }
        }
        System.out.println (" MDC " + mdc);
        return mdc;
    }
}
