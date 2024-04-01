import java.util.Scanner;
public class SalarioFuncionarios{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double horas;
        double horasValor;
        double salario;
        
        System.out.println("Informe o tempo em HORAS trabalhadas: ");
        horas = teclado.nextDouble();
        
        System.out.println("Informe o VALOR (R$) por hora apenas em numeros: ");
        horasValor = teclado.nextDouble();
        
        salario = BibliotecaSalario.calcSalario(horas, horasValor);
        System.out.println("Seu salário é de R$" + salario);
    }
    
    
    // se eu quiser definir o método de calculo dentro da própria classe, é só eu fazer o seguinte:
    
    /** public static double calcSalario(double h, double horasVal){
        double sal;
        
        sal = h * horasVal;
        return sal;
    }*/
}