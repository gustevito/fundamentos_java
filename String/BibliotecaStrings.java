
/**
 * semana do String
 * analise os metodos: (a) coloque nomes mais adequados ao que fazem; (b)coloque em comentarios como eles  
 * funcionam; (c) complete os métodos que faltam
 * Crie uma classe AppString que contenha o método main para testar os métodos da classe BibliotecaStrings 
 */
public class BibliotecaStrings
{

    public static int vogais(String palavra){
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {
            char letra = palavra.charAt(cont);
            if(letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra=='u'){
                total++;
            } 
        }
        return total;
    }

    public static boolean verficaInicio(String palavra){
        if(palavra.startsWith("por")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean verificaFim(String palavra){
        if(palavra.endsWith("ar")){
            return true;
        }else{
            return false;
        }
    }

    public static int quantidadeIn(String palavra){
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {            
            if(palavra.charAt(cont) == 'i')
            {                
                if(palavra.charAt(cont+1) == 'n')
                {
                    total++;
                } 
            } 
        }
        return total;
    }

    
    public static void metodo6 (String verbo){
        System.out.println("Eu " + verbo + "ei");
        System.out.println("Tu " + verbo + "as");
        System.out.println("Ele/Ela " + verbo + "a");
        System.out.println("Nos " + verbo + "emos");
        System.out.println("Vos " + verbo + "eis");
        System.out.println("Eles/Elas " + verbo + "ao");
    }
    
// recebe uma string que contém várias palavras e retorna a quantidade de palavras da frase
//    public static int contPalavras (String frase) {
//    }


// recebe uma string e retorna esta String com seus caracteres invertidos
// public static
// {
// }

// recebe duas strings e retorna a maior String: considere que o maior/menor seja em ordem alfabética
// public static
// {
// }

// recebe duas strings e retorna a menor String: considere que o maior/menor seja em ordem alfabética
// public static
// {
// }


} // fim da classe