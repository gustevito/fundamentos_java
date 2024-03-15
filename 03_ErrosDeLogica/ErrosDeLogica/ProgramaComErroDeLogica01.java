
/**
 * Write a description of class ProgramaComErroDeLogica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgramaComErroDeLogica01
{
    public static void main(String args[]){
        int valor1 = 7;
        int valor2 = 8;
        double media = (valor1 + valor2) / 2; // estava sem parenteses
        System.out.println("\fMédia Aritmética: " + media);
    }

}
