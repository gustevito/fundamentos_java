import java.util.Scanner;
public class Imposto{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int codProduto;
        int codContinente;
        double preco;
        double quilo;
        double calcPrecoQuilo;
        double imposto;
        
        System.out.println("Informe o codigo do produto: ");
        codProduto = teclado.nextInt();
        
        preco = Biblioteca.precoQuilo(codProduto);
        System.out.println("Este produto custa R$" + preco + "/Kg");
        System.out.println("Agora, informe o peso (em Kg) do produto: ");
        
        quilo = teclado.nextDouble();
        calcPrecoQuilo = (preco * quilo);
        if (calcPrecoQuilo < 0){
            System.out.print("ERRO! Informe um valor valido para calcular!");
            return;
        } else {
        System.out.println("Valor: R$" + calcPrecoQuilo);
        }
        
        // agora vamos calcular o imposto 
    }
}