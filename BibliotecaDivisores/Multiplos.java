import java.util.Scanner;
public class Multiplos{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo;
        
        int a;
        int b;
        int resultado;
        
        System.out.println("Bem vindo usuario, digite o codigo referente a conta que deseja realizar:");
        System.out.println();
        System.out.println("            MENU            ");
        System.out.println();
        System.out.println("    1 - Quantidade de MULTIPLOS DE 3 entre dois numeros:     ");
        System.out.println("    2 - SOMAR os PARES entre dois numeros:     ");
        
        codigo = teclado.nextInt();
        switch (codigo){
            case 1:
                System.out.println("Insira um numero A:");
                a = teclado.nextInt();
                
                System.out.println("Insira um numero B:");
                b = teclado.nextInt();
                
                resultado = BibliotecaMultiplos.qtdeMultiplos(a, b);
                System.out.println("Este numero possui " + resultado + " multiplos de 3.");
            break;
            case 2:
                System.out.println("Insira um numero A:");
                a = teclado.nextInt();
                
                System.out.println("Insira um numero B:");
                b = teclado.nextInt();
                
                resultado = BibliotecaMultiplos.somaDosPares(a, b);
                System.out.println("A soma dos pares entre A e B é: " + resultado);
            break;
            default: System.out.println("ERRO!");
        }
    }
}