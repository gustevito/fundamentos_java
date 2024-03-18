
/*
 * Escreva uma descrição da classe CalculoG1 aqui.
 * 
 * @Gustavo 
 * @1.0
 */
import java.util.Scanner;

public class CalculoG1{
    public static void main(System args[]){     
        Scanner teclado = new Scanner(System.in);
    
        double resultado, provaUm, provaDois, exercicioUm, exercicioDois, exercicioTres, exercicios, trabalhoFinal;
        
        System.out.println("Calculadora da G1");
        System.out.println("Informe a nota da sua P1:");
        provaUm = teclado.nextDouble();
        System.out.println("Informe a nota da sua P2:");
        provaDois = teclado.nextDouble();
        System.out.println("Informe a nota do seu E1:");
        exercicioUm = teclado.nextDouble();
        System.out.println("Informe a nota do seu E2:");
        exercicioDois = teclado.nextDouble();
        System.out.println("Informe a nota do seu E3:");
        exercicioTres = teclado.nextDouble();
        System.out.println("Informe a nota do seu TF:");
        trabalhoFinal = teclado.nextDouble();
        
        exercicios = (exercicioUm + exercicioDois + exercicioTres)/3;
        resultado = (provaUm + 2 * provaDois + exercicios + 2 * trabalhoFinal)/6;
        System.out.println("Valor medio: " + resultado);
        
    }
}
