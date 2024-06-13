
/**
 * Escreva uma descrição da classe AppCaixa1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppCaixa1{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        // instancia objeto caixaSapato com o construtor que possui parâmetros
        Cor cor = new Cor ("Vermelha" , "Inc Coor");
        Caixa c1 = new Caixa(3,3,3,cor,'M');
        System.out.println ("Mostrando a caixa c1 " + c1);
        System.out.println ("Mostrando o objeto cor " + c1.getCor());
        System.out.println ("Mostrando o fornecedor do objeto cor " + c1.getCor().getFornecedor()); // mostra o fornecedor da cor da caixa
        
        
        Caixa c2 = new Caixa ();
        System.out.println ("Mostrando a caixa c1 " + c2);
        System.out.println ("Mostrando o objeto cor " + c2.getCor());
        
        System.out.println ("Mostrando o fornecedor do objeto cor " + c2.getCor().getFornecedor()); // erro porque o objeto cor não foi criado
        
        
    }
}
