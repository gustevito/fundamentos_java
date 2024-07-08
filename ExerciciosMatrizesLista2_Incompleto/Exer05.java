
/**
 * Dada uma matriz de ordem 4: 
 * (a) mostrar quantos números pares estão armazenados acima da diagonal principal; 
 * (b) mostrar quantos números ímpares estão armazenados abaixo da diagonal principal
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
        String vetor[] = new String[5];
        int cont=0;
        for (int i = 0; i<vetor.length;i++)
        {
            System.out.println ("Informe um nome:");
            vetor[i] = teclado.nextLine();
        }
        System.out.println ("Quantidade de nomes que terminam com 'r': " 
                                   + BibliotecaFinal.terminaComLetra(vetor, 'r'));
        System.out.println ("Quantidade de nomes que possuem tamanho indicado por um número par: " 
                                   + BibliotecaFinal.tamanhoPar(vetor));
        int contA = BibliotecaFinal.comecaComLetra(vetor, 'a'); 
        int contE = BibliotecaFinal.comecaComLetra(vetor, 'e'); 
        int contI = BibliotecaFinal.comecaComLetra(vetor, 'i'); 
        int contO = BibliotecaFinal.comecaComLetra(vetor, 'o'); 
        int contU = BibliotecaFinal.comecaComLetra(vetor, 'u'); 
        System.out.println ("Quantidade de nomes existentes no vetor que iniciam por uma vogal: " 
                                   + (contA+contE+contI+contO+contU));
        String maiorNome = BibliotecaFinal.maiorNome(vetor);
        cont = 0;
        for (int i = 0; i<vetor.length;i++)
        {
            if (vetor[i].length() == maiorNome.length())
            {
                cont++;
            }
        }
        double porcentagem = (double) (cont*100)/vetor.length;
        System.out.println ("Maior palavra e seu tamanho de palavra: " + maiorNome + " " + maiorNome.length());
        System.out.println ("Porcentagem de nomes que possuem o maior tamanho de palavra: " 
                                   + porcentagem);
        int maior = 0, pos = 0;
        maiorNome = "";
        for (int i = 0; i<vetor.length; i++)
        {
            if (BibliotecaFinal.consoantes(vetor[i]) > maior)
            {
                maior = BibliotecaFinal.consoantes(vetor[i]);
                maiorNome = vetor[i];
                pos = i;
            }
        }
        System.out.println ("Palavra com mais consoantes e sua posição " + maiorNome + " " + pos);
    }
}
