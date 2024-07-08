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

    public static boolean verificaInicioInput(String palavra, String prefixo){
        if(palavra.startsWith(prefixo)){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean verificaFim(String verbo){
        if(verbo.endsWith("ar")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean verificaFimInput(String palavra, String sufixo){
        if(palavra.endsWith(sufixo)){
            return true;
        }else{
            return false;
        }
    }
    
    public static int verificaQuantidadeDeIn(String palavra){
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

    public static boolean verificaFimConjuga(String verbo){
        if(verbo.endsWith("ar") || verbo.endsWith("er") || verbo.endsWith("ir") || verbo.endsWith("or")){
            return true;
        } else{
            return false;
        }
    }
    
    public static void conjugaVerboFuturo (String verbo){
        System.out.println("Eu " + verbo + "ei");
        System.out.println("Tu " + verbo + "ás");
        System.out.println("Ele/Ela " + verbo + "á");
        System.out.println("Nós " + verbo + "emos");
        System.out.println("Vós " + verbo + "eis");
        System.out.println("Eles/Elas " + verbo + "ão");
    }
    
    public static void conjugaVerboPresente (String verbo, char vogal){
        verbo = verbo.substring(0, verbo.length() -2);
        
        
        System.out.println("Eu " + verbo + "o");
        System.out.println("Tu " + verbo + vogal + "s");
        System.out.println("Ele/Ela " + verbo + vogal);
        System.out.println("Nós " + verbo + vogal + "mos");
        System.out.println("Vós " + verbo + vogal + "is");
        System.out.println("Eles/Elas " + verbo + vogal + "m");
    }
    
    public static void conjugaVerboPassado (String verbo, char vogal){
        if (verbo.endsWith("ar")){
            verbo = verbo.substring(0, verbo.length() -2);   
            
            System.out.println("Eu " + verbo + "uei");
            System.out.println("Tu " + verbo + vogal + "s");
            System.out.println("Ele/Ela " + verbo + vogal);
            System.out.println("Nós " + verbo + vogal + "mos");
            System.out.println("Vós " + verbo + vogal + "is");
            System.out.println("Eles/Elas " + verbo + vogal + "m");
            
        }
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