
/**
 * Escreva uma descrição da classe Exemplo4 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
import java.io.IOException;
public class Exemplo3
{
     public static void main(String args[]) throws IOException
    {
        //Instrução de entrada
        //Permite a leitura de dados via teclado. É assim que buscamos os valores digitados pelo usuário
        Scanner teclado = new Scanner(System.in);
        String nome;
        double altura;
        int idade;
        char categoria;
        
        System.out.print("\fInforme o seu nome: ");
        nome = teclado.nextLine();  //como ler string
        
        System.out.print("Informe a sua altura: ");
        altura = teclado.nextDouble();  //como ler um double
        
        System.out.print("Informe a sua idade: ");
        idade = teclado.nextInt();  //como ler um int

        System.out.println("Informe sua categoria funcional (A - B - C):");
        // como ler um char: opção 1
        //categoria = (char) System.in.read(); 
        // como ler um char: opção 2
        teclado.nextLine(); // limpeza do buffer
        categoria = teclado.nextLine().charAt(0);
        System.out.println("Nome = " + nome + " Altura = " + altura + " Idade = " + idade + " Categoria = " + categoria);

    
    }
}
