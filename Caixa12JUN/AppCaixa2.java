
/**
 * descrição da classe AppCaixa2: cria vetor de caixas, preenche o vetor, mostra
 * a soma dos volumes das caixas, mostra a quantidade de caixas vermelhas e mostra
 * as caixas armazenadas no vetor. Utilizando métodos.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppCaixa2
{
    public static void main (String args[])
    {
        Caixa caixas[] = new Caixa[3];
        
        leCaixas (" conjunto de caixas ", caixas);
        
        System.out.println ("Soma dos volumes das caixas: " + somaVolumes (caixas));
        System.out.println ("Qtde caixas da cor vemelha: " + qtdeCaixasVermelhas (caixas));
                
        escreveCaixas (" conjunto de caixas ", caixas);
    }
    public static int qtdeCaixasVermelhas (Caixa caixas[])
    {
        int qtde = 0;
        for (int i=0; i<caixas.length; i++)
        {
            if (caixas[i].getCor().getNome().equals("vermelha"))
            {
                qtde++;
            }
        }
        return qtde;
    }
    public static double somaVolumes (Caixa caixas[])
    {
        double soma = 0;
        for (int i=0; i<caixas.length; i++)
        {
            soma += caixas[i].volume();
        }
        return soma;
    }
    public static void leCaixas (String nome, Caixa caixas[])
    {
        Scanner teclado = new Scanner (System.in);
        
        Cor cor;
        //Caixa caixa;
        String nomeCor,nomeForn;
        double altura, largura, profundidade;
        
        System.out.println ("Lendo valores para o" + nome);
        for (int i=0; i<caixas.length; i++)
        {
            System.out.println ("Informe o nome da cor da caixa: ");
            nomeCor = teclado.nextLine();
            System.out.println ("Informe o nome do fornecedor da cor da caixa: ");
            nomeForn = teclado.nextLine();
            cor = new Cor (nomeCor, nomeForn);
            
            System.out.println ("Informe a altura da caixa: ");
            altura = teclado.nextInt();
            System.out.println ("Informe a largura da caixa: ");
            largura = teclado.nextInt();
            System.out.println ("Informe a profundidade da caixa: ");
            profundidade = teclado.nextInt();
            teclado.nextLine();
            
            caixas[i] = new Caixa(altura, largura, profundidade, cor);
            //caixa = new Caixa(altura, largura, profundidade, cor);
            //caixas[i] = caixa;
            
            
        }
        
    }
    public static void escreveCaixas (String nome, Caixa caixas[])
    {
        System.out.println ("Escrevendo os dados para o" + nome);
        //for (int i=0; i<caixas.length; i++)
        //{
        //    System.out.println (caixas[i]);
        //}
        // imprimindo com for aprimorado
        for (Caixa caixa : caixas)
        {
            System.out.println (caixa);
        }
        
    }
}
