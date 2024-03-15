
/*
 * Escreva uma descrição da classe DesafioValorInverso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class DesafioValorInverso{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int inputInt = getInput(teclado);
        System.out.println(inputInt);
    }
    public static int getInput(Scanner teclado){
        System.out.println("Insira um numero de 4 digitos:");
        int input = 0;
        
        while (true) {
            input = teclado.nextInt();
            if (input > 9999 && input < 1000)
            break;
            System.out.println("ERRO## Insira um numero de 4 digitos!");
        }
        
    }
    

}


    /*
     * var1 = 3;
     * var2 = 5;
     * 
     * result1 = var1++ * ++var2 (19)
     * result2 = ++var2 - var1++ (4)
     * result3 = var1++ / (var2 - var1) (2,5)
     */