public class BibliotecaStrings
{
    // método que conta o número de vogais na palavra fornecida
    public static int vogais(String palavra){
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {
            char letra = palavra.charAt(cont);
            // verifica se a letra atual é uma vogal
            if(letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra=='u'){
                total++;
            } 
        }
        return total;
    }

    // método que verifica se a palavra começa com "por"
    public static boolean verficaInicio(String palavra){
        if(palavra.startsWith("por")){
            return true;
        }else{
            return false;
        }
    }

    // método que verifica se a palavra começa com o prefixo fornecido
    public static boolean verificaInicioInput(String palavra, String prefixo){
        if(palavra.startsWith(prefixo)){
            return true;
        }else{
            return false;
        }
    }
    
    // método que verifica se a palavra termina com "ar"
    public static boolean verificaFim(String verbo){
        if(verbo.endsWith("ar")){
            return true;
        }else{
            return false;
        }
    }
    
    // método que verifica se a palavra termina com o sufixo fornecido
    public static boolean verificaFimInput(String palavra, String sufixo){
        if(palavra.endsWith(sufixo)){
            return true;
        }else{
            return false;
        }
    }
    
    // método que conta a quantidade de ocorrências da sequência "in" na palavra
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

    // método que verifica se a palavra termina com "ar", "er", "ir" ou "or"
    public static boolean verificaFimConjuga(String verbo){
        if(verbo.endsWith("ar") || verbo.endsWith("er") || verbo.endsWith("ir") || verbo.endsWith("or")){
            return true;
        } else{
            return false;
        }
    }
    
    // método que imprime a conjugação do verbo no futuro
    public static void conjugaVerboFuturo (String verbo){
        System.out.println("Eu " + verbo + "ei");
        System.out.println("Tu " + verbo + "ás");
        System.out.println("Ele/Ela " + verbo + "á");
        System.out.println("Nós " + verbo + "emos");
        System.out.println("Vós " + verbo + "eis");
        System.out.println("Eles/Elas " + verbo + "ão");
    }
    
    // método que imprime a conjugação do verbo no presente
    public static void conjugaVerboPresente (String verbo, char vogal){
        verbo = verbo.substring(0, verbo.length() -2);
        
        
        System.out.println("Eu " + verbo + "o");
        System.out.println("Tu " + verbo + vogal + "s");
        System.out.println("Ele/Ela " + verbo + vogal);
        System.out.println("Nós " + verbo + vogal + "mos");
        System.out.println("Vós " + verbo + vogal + "is");
        System.out.println("Eles/Elas " + verbo + vogal + "m");
    }
    
    // método que imprime a conjugação do verbo no passado
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

    public static int tamanhoPalavra(String palavra){
        int tamanho = palavra.length();// metodo que retorna numero de letras e espaços na palavra/
        return tamanho; // retorna o mesmo/
   }
   
   public static char letraEspecifica(String palavra,int numero){
        char letra = palavra.charAt(numero);// metodo usado para ver a letra no momoento especifico/
        return letra; //retorna a letra no espaço especificado pelo usuário/
   }
   
   public static boolean saoIguais(String palavra1,String palavra2){
       // metodo para verificar se duas palavras sao iguais/
       if(palavra1.equalsIgnoreCase(palavra2)){
           return true;
       }
       else{
           return false;
       }
       // retorna true se as palavaras forem iguais se não retornar false/
   }
   
   public static boolean comecaCom(String palavra1,String prefixo){
       //metodo que verifica se a palavra começa com o prefixo falado pelo usuario
       if(palavra1.startsWith(prefixo)){
           return true;  
       }
       else{
           return false;
        }
    }
} 