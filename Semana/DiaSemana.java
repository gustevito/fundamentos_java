
/**
 * Escreva uma descrição da classe DiaSemana aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class DiaSemana{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Informe um numero de 1 a 7 para ver o respectivo dia da semana: ");
        dia = teclado.nextInt();
        

        if (dia <= 0 && dia > 7){
            System.out.println("ERRO! Informe um numero entre 1 a 7");
            
        }
        
        if (dia == 1) {
            System.out.println("Domingo");
        }
        else if (dia == 2) {
            System.out.println("Segunda");
        }
        else if (dia == 3) {
            System.out.println("Terça");
        }
        else if (dia == 4) {
            System.out.println("Quarta");
        }
        else if (dia == 5) {
            System.out.println("Quinta");
        }
        else if (dia == 6) {
            System.out.println("Sexta");
        }
        else if (dia == 7) {
            System.out.println("Sabado");
        }

    }
}

