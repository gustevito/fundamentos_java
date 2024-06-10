public class ForPessoa{
    public static void main (String args[]){
        Pessoa pessoas[] = new Pessoa[3];
        String nomes[] = {"A", "B", "C"};
        
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i] = new Pessoa(i+1, nomes[i]);
        }
        for (int i = 0;i < pessoas.length; i++){
            System.out.println(pessoas[i]);
        }
    }
}