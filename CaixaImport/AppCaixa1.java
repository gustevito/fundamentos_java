
/**
 * descrição da classe AppCaixa1: criar vetor de objetos, ler os dados para o vetor e mostrar
 * os valores. Utilizando métodos.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppCaixa1
{
    public static void main (String args[])
    {
        Caixa caixas[] = new Caixa[3];
        
        leCaixas (" conjunto de caixas ", caixas);
              
        escreveCaixas (" conjunto de caixas ", caixas);
    }
    
    public static void leCaixas (String nome, Caixa caixas[])
    {
        Scanner teclado = new Scanner (System.in);
        
        Cor cor;
        String nomeCor,nomeForn;
        double altura, largura, profundidade;
        
        System.out.println ("Lendo valores para o " + nome);
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
        
    }
    public static void escreveCaixas (String nome, Caixa caixas[])
    {
        System.out.println ("Escrevendo os dados para o" + nome);
        // imprimindo com for tradicional
        //for (int i=0; i<caixas.length; i++)
        //{
        //    System.out.println (caixas[i]);
        //}
        // imprimindo com for aprimorado
        for (Caixa c1 : caixas)
        {
            System.out.println (c1);
        }
        
    }
}
