import java.util.Scanner;
public class Divisores{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int x;
        boolean resultado;
        
        System.out.println("Informe um numero para descobrir se ele é perfeito ou nao: ");
        x = teclado.nextInt();
        
        resultado = BibliotecaDivisores.ehNumeroPerfeito(x);
        System.out.println(resultado);
    }
}