public class Pessoa{
    private String nome;
    private int idade;
    
    // metodo construtor
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    // getters
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    
    // setters
    public void setNome(){
        this.nome = nome;
    }
    
    public void setIdade(){
        this.idade = idade;
    }
    

    // metodos
    
    // toString
    public String toString(){
        return "Pessoa" +
        "\nNome: " + nome +
        "\nIdade: " + idade;
    }
    
}