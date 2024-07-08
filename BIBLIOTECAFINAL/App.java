/**
 * @Gustavo Flores 
 */
import java.util.Scanner;
public class App
{
    public static void main(String [] args)
    {
         Scanner teclado = new Scanner (System.in);
         String nomes[];
                  
         CadastroPessoasParte2 cp= new CadastroPessoasParte2(5);
         Pessoa p1 = new Pessoa ("José",1,35000);
         Pessoa p2 = new Pessoa ("Angela",2,45000);
         Pessoa p3 = new Pessoa ("Francisco",3,10000);
         Pessoa p4 = new Pessoa ("Ana",4,20000);
         Pessoa p5 = new Pessoa ("Beatriz", 10, 8000);
                  
         cp.adicionaNoVetor(p1);
         cp.adicionaNoVetor(p2);
         cp.adicionaNoVetor(p3);
         cp.adicionaNoVetor(p4);
         cp.adicionaNoVetor(p5);
         cp.imprimeVetor();
         
         System.out.println("\nQtde de super salario: " + cp.contaSuperSalario());     
         System.out.println ("\nProcura: " + cp.localizaPessoa(p2));
         System.out.println ("\nMaior salário: " + cp.maiorSalario());
         
         cp.aumentaSalario(p1);
         System.out.println ("\nDepois de aumentar salário ");
         cp.imprimeVetor();
         
         cp.removePessoa(p1);
         System.out.println ("\nDepois de remover ");
         cp.imprimeVetor();
         
         System.out.println ("\nPessoa de menor salário: " + cp.menorSalarioPessoa().toString());
         
         System.out.println ("\nNomes em ordem: Array" );
         nomes = cp.nomesEmOrdem();
         for (String nomePessoa : nomes)
         {
             System.out.println (nomePessoa);
         }
         System.out.println ("\nNomes em ordem: Bubble" );
         nomes = cp.nomesEmOrdemBubble();
         for (String nomePessoa : nomes)
         {
             System.out.println (nomePessoa);
         }
         System.out.println ("\nNomes em ordem: Bubble obj" );
         cp.nomesEmOrdemBubbleObj();
    }
}
