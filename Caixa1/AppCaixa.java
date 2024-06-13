
/**
 * Escreva uma descrição da classe AppCaixa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class AppCaixa{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        // instancia objeto caixaSapato com o construtor que possui parâmetros
        Cor cor = new Cor ("Vermelha" , "Inc Coor");
        
        // mostrar a primeira caixa
        Caixa c1 = new Caixa(3,3,3,cor, 'M'); // Adicionado o tamanho 'M'
        //System.out.println (caixaSapato.toString());
        System.out.println ("Mostrando a caixa c1 " + c1);
        
        
        // mostrar a segunda caixa
        Caixa c2 = new Caixa();
        System.out.println (" ");
        System.out.println ("Mostrando a caixa c2 " + c2);
        
        
        // input de dados para a segunda caixa
        System.out.println ("Informe o valor da altura: ");
        double altura = teclado.nextDouble();
        c2.setAltura (altura); 
        
        System.out.println ("Informe o valor da largura: ");
        double largura = teclado.nextDouble();
        c2.setLargura (largura);
        
        System.out.println ("Informe o valor da profundidade: ");
        double profundidade = teclado.nextDouble();
        c2.setProfundidade (profundidade);
        
        teclado.nextLine();
        System.out.println ("Informe o nome da cor: ");
        String nome = teclado.nextLine();
        System.out.println ("Informe o tamanho da caixa (P, M ou G): ");
        char tamanho = teclado.nextLine().charAt(0); // Ajuste para capturar corretamente o tamanho
        System.out.println ("Informe o nome do fornecedor: ");
        String fornecedor = teclado.nextLine();
        
        Cor cor2 = new Cor (nome, fornecedor);
        
        c2.setCor(cor2);
        c2.setTamanho(tamanho); // Certifique-se de que o tamanho é aplicado corretamente
        System.out.println ("Mostrando a caixa c2 " + c2);
    

        //System.out.println ("Fornecedor da caixa c2: " + c2.getCor().getFornecedor());
        
        /*
        c2.getCor().setFornecedor("Fornecedor Oficial");
        System.out.println ("Mostrando a caixa c2 " + c2);
        */      
        

    }
}
