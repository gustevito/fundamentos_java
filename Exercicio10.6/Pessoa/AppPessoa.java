public class AppPessoa{
    public static void main (String args[]){
        Pessoa pessoas[] = new Pessoa[3];
        
        pessoas[0] = new Pessoa(1, "caraio");
        pessoas[1] = new Pessoa(2, "carai");
        pessoas[2] = new Pessoa(3, "caraiao");
        
        System.out.println(pessoas[0]);
        System.out.println(pessoas[1]);
        System.out.println(pessoas[2]);
        
        
    }
}