
/**
 * Esta classe Exer01 aqui só contém o método main e sua estrutura. As soluções
 * dos problemas encontram-se na classe BiblitocaExer01.
 * Aqui utilizei a estratégia de implementar a solução em duas classes distintas.
 * Poderia ser implementada com a estratégia de colocar os métodos nesta classe,
 * ficando ela com os métodos de solução de problemas + o método main. 
 * Mudaria apenas a forma de chamar os métodos, conforme comentário no código.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Exer01
{
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        double n1, n2, n3, nf;
        char conceito;
        
        System.out.println ("Informe a primeira nota: ");
        n1 = teclado.nextDouble();
        System.out.println ("Informe a segunda nota: ");
        n2 = teclado.nextDouble();
        System.out.println ("Informe a terceira nota: ");
        n3 = teclado.nextDouble();
        
        // chamada do método que calcula a media. 
        // são enviadas a n1, n2, n3 e retorna o valor da media
        // Se o método estivesse nesta 
        // classe a chamada seria desta forma: calNF (n1, n2, n3).
        // 
        nf = BibliotecaExer01.calNF (n1, n2, n3);
        
        // chamada do método que busca o conceito. 
        // é enviada a nf e retorna o conceito referente ao intervalo da nf
        // Se o método estivesse nesta 
        // classe a chamada seria desta forma: verificaConceito (nf);
        //
        conceito = BibliotecaExer01.verificaConceito (nf);
        
        System.out.println ("Seu conceito final foi: " + conceito);
        
        
    }
}
