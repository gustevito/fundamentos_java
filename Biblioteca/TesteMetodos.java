
/**
 * Escreva uma descrição da classe CalcMedia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class TesteMetodos {
    public static void main (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor: ");
        double x = teclado.nextDouble();
        System.out.println("Insira o segundo valor: ");
        double y = teclado.nextDouble();
        System.out.println("Insira o terceiro valor: ");
        double z = teclado.nextDouble();
        
        double retorno = Biblioteca.maiorValor(x, y, z);
        
        System.out.println(retorno);
    }
}

