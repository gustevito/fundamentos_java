
/**
 * Essa biblioteca serve para o projeto desenvolvido na aula referente
 * a estruturas condicionais com uso de operadores lógicos.
 * Aqui utilizei a estratégia com duas classes: BibliotecaExer01 e Exer01
 * 
 * Mas poderia ser implementado colocando-se estes dois métodos dentro da 
 * classe Exer01. Os métodos teriam a mesma programação.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BibliotecaExer01
{
    // método que recebe as três notas e calcula a nf, conforme fórmula, 
    // retornando o valor da nf
    public static double calNF (double n1, double n2, double n3) {
        double nf = 0;
        
        nf = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        
        return nf;
    }
    
    // método que recebe o valor da nf e retorna um char referente ao conceito
    // conforme escore da nf
    public static char verificaConceito (double nf) {
        char conceito = ' ';
        if ((nf >= 8.0) && (nf <= 10.0)) {
            conceito = 'A';
        }
        if ((nf >= 7.0) && (nf < 8.0)) {
            conceito = 'B';
        }
        if ((nf >= 6.0) && (nf < 7.0)) {
            conceito = 'C';
        }
        if ((nf >= 5.0) && (nf < 6.0)) {
            conceito = 'D';
        }
        if ((nf >= 0.0) && (nf < 5.0)) {
            conceito = 'E';
        }
        return conceito;
    }
}
