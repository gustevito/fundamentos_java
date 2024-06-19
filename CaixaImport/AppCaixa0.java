
/**
 * Descrição da classe AppCaixa0: cria um vetor para guardar 3 caixas. Lê os valores 
 * para os atributos via teclado
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppCaixa0
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner (System.in);
        Caixa caixas[] = new Caixa[3];
        
        Cor cor;
        String nomeCor,nomeForn;
        double altura, largura, profundidade;
        
        for (int i=0; i<caixas.length; i++)
        {   
            System.out.println ("Qual a cor da caixa? ");
            nomeCor = teclado.nextLine();
            System.out.println ("Qual o fornecedor da cor da caixa? ");
            nomeForn = teclado.nextLine();
            cor = new Cor (nomeCor, nomeForn);
            
            System.out.println ("Qual a altura da caixa? ");
            altura = teclado.nextDouble();
            System.out.println ("Qual a largura da caixa? ");
            largura = teclado.nextDouble();
            System.out.println ("Qual a profundidade da caixa? ");
            profundidade = teclado.nextDouble();
            teclado.nextLine();
            
            caixas[i] = new Caixa(altura, largura, profundidade, cor);
        }
        
        
        System.out.println ("Escrevendo os dados das caixas armazenadas ....");
        for (Caixa c1 : caixas)
        {
            System.out.println (c1);
        }
    }
}
