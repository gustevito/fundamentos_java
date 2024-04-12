
/**
 *  TesteMetodos, como o nome ja diz, se trata da classe responsavel por realizar o teste de todos os metodos declarados na
 *  biblioteca nomeada criativamente como Biblioteca!
 * 
 * @author (Gustavo Flores) 
 * @version (22.03.2024)
 */

import java.util.Scanner;

public class TesteMetodos {
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in);
       
       int codigo;
       
       int grupo;
       int idade;
       int menor = 0;
       int maior = 0;
       
       System.out.println("Bem vindo usuario, digite o codigo referente a conta que deseja realizar:");
       System.out.println();
       System.out.println("            MENU            ");
       System.out.println();
       System.out.println("    1 - MAIOR e MENOR idade     ");
       
       codigo = teclado.nextInt();
       switch (codigo){
           case 1:
               System.out.println("");
               System.out.println("Insira a QUANTIDADE de pessoas de um grupo e suas respectivas idades para descobrir o MAIOR e o MENOR valor entre elas:"); 
               System.out.println("");
               System.out.println("Quantidade de pessoas no GRUPO:");
               grupo = teclado.nextInt();
               System.out.println("Agora, insira " + grupo + " idades");
               
               for (int cont = 0; cont < grupo; cont++){
                   idade = teclado.nextInt();
                   
                   if (cont == 0){
                       maior = menor = idade;
                   }
                   
                   if (idade > maior){
                       maior = idade;
                   }
                   
                   if (idade < menor){
                       menor = idade;
                   }
               }
               
               System.out.println("Menor idade: " + menor);
               System.out.println("Maior idade: " + maior);
            
           break;         
           default: System.out.println("ERRO");
       }

       
    }
}


