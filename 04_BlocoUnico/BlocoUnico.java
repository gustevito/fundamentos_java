
/**
 * Escreva uma descrição da classe Modularização aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class BlocoUnico{
        public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        
        double nro1, nro2, nro3;
        separador();
        System.out.println ("Informe o número 1:");
        nro1 = entrada.nextDouble();
        separador();
        System.out.println ("Informe o número 2:");
        nro2 = entrada.nextDouble();
        separador();
        System.out.println ("Informe o número 3:");
        nro3 = entrada.nextDouble();    

        separador();
        System.out.println ("A média calculada foi: " + media(nro1, nro2, nro3));
    }
    public static void separador() {
    System.out.println ("********************");
}

    public static double media(double nro1, double nro2, double nro3) {
        return (nro1 + nro2 + nro3) /3;
    }
}


    
