
/**
 * verificações para armazenar os valores desejados: 
 * no máximo 81 elementos e a quantidade de elementos deve caber em uma matriz quadrada
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
        
        // agora é a sua vez .... faça o que se pede na sequẽncia
    }
}
