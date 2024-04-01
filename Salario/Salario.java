import java.util.Scanner;
public class Salario{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double horas;
        double horasValor;
        double salario;
        
        System.out.println("Informe o tempo em HORAS trabalhadas: ");
        horas = teclado.nextDouble();
        
        System.out.println("Informe o VALOR (R$) por hora apenas em numeros: ");
        horasValor = teclado.nextDouble();
        
        salario = (horas * horasValor);
        System.out.println("Seu salário é de R$" + salario);
    }
}