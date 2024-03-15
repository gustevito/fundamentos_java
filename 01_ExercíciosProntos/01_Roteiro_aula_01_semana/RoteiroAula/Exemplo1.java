
/**
 * O codigo declara 4 variaveis: uma do tipo "booleana" (verdadeiro ou falso), outra do tipo "char" (caractere unico), do tipo "string" (texto) e outra "int" que indica um numero inteiro.
 * Depois dessas declaraçoes, ele executa uma ordem de açoes com essa variaveis e, ao final dessas açoes, ele realiza uma combinaçao de variaveis que resultam em uma mensagem a ser exibida
 * na tela
 * 
 * 
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Exemplo1
{
    public static void main(String args[])
    {
        boolean opcao1, opcao2;
        char letra1, letra2;
        String nome1, nome2;
        int num = 10;

        opcao1 = true;
        System.out.println("opcao1 = " + opcao1);
        opcao2 = false;
        System.out.println("opcao2 = " + opcao2);
        letra1 = 'a';
        System.out.println("letra1 = " + letra1);
        letra2 = '#';
        System.out.println("letra2 = " + letra2);
        nome1 = "Predio 32";
        System.out.println("nome1 = " + nome1);
        nome2 = nome1 + letra1;
        System.out.println("nome2 = " + nome2);
        nome1 = nome1 + " é " + num;
        System.out.println("nome1 = " + nome1);
    }
}

