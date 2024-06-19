
/**
 * 
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppPessoaParte1
{
    public static void main(String [] args)
    {
         Scanner teclado = new Scanner (System.in);
                 
         CadastroPessoasParte1 cp= new CadastroPessoasParte1(5);
         Pessoa p1 = new Pessoa ("Ana",1,35000);
         Pessoa p2 = new Pessoa ("Angela",2,45000);
         Pessoa p3 = new Pessoa ("Francisco",3,10000);
         Pessoa p4 = new Pessoa ("José",4,20000);
                
         cp.adicionaNoVetor(p1);
         cp.adicionaNoVetor(p2);
         cp.adicionaNoVetor(p3);
         cp.adicionaNoVetor(p4);
         cp.imprimeVetor();
         
         System.out.println("\n Super salario: " + cp.contaSuperSalario());
                
         System.out.println ("Procura: " + cp.localizaPessoa(p2));
         
         System.out.println ("Maior salário: " + cp.maiorSalario());
         
    }
}
