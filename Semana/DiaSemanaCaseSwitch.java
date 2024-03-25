
/**
 * Escreva uma descrição da classe DiaSemana aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class DiaSemanaCaseSwitch{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Informe um numero de 1 a 7 para ver o respectivo dia da semana: ");
        dia = teclado.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: 
                System.out.println("ERRO! Escolha um numero valido!");
        }
        
    }
}

