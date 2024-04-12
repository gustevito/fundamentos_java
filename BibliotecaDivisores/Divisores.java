import java.util.Scanner;
public class Divisores{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int codigo;
        
        int x;
        int resultadoNum;
        boolean resultado;
        
        System.out.println("Bem vindo usuario, digite o codigo referente a conta que deseja realizar:");
        System.out.println();
        System.out.println("            MENU            ");
        System.out.println();
        System.out.println("    1 - Descobrir a quantidade de divisores do numero     ");
        System.out.println("    2 - Descobrir se o numero é primo    ");
        System.out.println("    3 - Descobrir se o numero é perfeito     ");
        System.out.println("    4 - Descobrir se o numero é abundante     ");
        
        codigo = teclado.nextInt();
    
        switch (codigo){
            case 1:
                System.out.println("Informe um numero para descobrir sua quantidade de divisores: ");
                x = teclado.nextInt();
                
                resultadoNum = BibliotecaDivisores.qtdeDivisores(x);
                System.out.println("Este número possui " + resultadoNum + " divisores");
            break;
            case 2:
                System.out.println("Informe um numero para descobrir se ele é primo:");
                x = teclado.nextInt();
                
                resultado = BibliotecaDivisores.ehPrimo(x);
                System.out.println(resultado);
            break;
            case 3:
                System.out.println("Informe um numero para descobrir se ele é perfeito:");
                x = teclado.nextInt();
                
                resultado = BibliotecaDivisores.ehNumeroPerfeito(x);
                System.out.println(resultado);
            break;
            case 4:
                System.out.println("Informe um numero para descobrir se ele é abundante");
                x = teclado.nextInt();
                
                resultado = BibliotecaDivisores.ehNumeroAbundante(x);
                System.out.println(resultado);
            break;
            default: System.out.println("ERRO");
        }

                

    }
}