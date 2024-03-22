
/**
 * Escreva uma descrição da classe CalcMEdia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
    public class CalculoMedia{
        public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
            
        double nota1, nota2, media;
        
        System.out.println ("Informe o número 1:");
        nota1 = entrada.nextDouble();
        
        System.out.println ("Informe o número 2:");
        nota2 = entrada.nextDouble();
        
        media = calcMedia (nota1, nota2);
        System.out.println ("A média calculada foi: " + media);
        
        if (media >= 7.0) { // se o valor da variavel media for maior ou igual a 7, o aluno estara aprovado
            System.out.println("APROVADO :)");
        } else {
            System.out.println("REPROVADO :("); // caso contrario, o aluno sera reprovado
        }
        
    }
        public static double calcMedia (double n1, double n2){
        double resultado;
        resultado = (n1 + n2) / 2;
        return resultado;
    }
}

