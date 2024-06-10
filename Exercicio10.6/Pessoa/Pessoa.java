public class Pessoa{
    // definiçao de atributos
    private int nro;
    private String nome;
    
    public Pessoa(int nro, String nome){
        this.nro = nro;
        this.nome = nome;
    }
    
    // getters (retorno +/- parametro)
    public int getNro(){
        return this.nro;
    }
    public String getNome(){
        return this.nome;
    }
    
    // setters (void + parametro)
    public void setNro(int nro){
        this.nro = nro;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // estado do objeto
    public String toString(){
        return "Nro: " + this.nro + "\r\n" + "Nome: " + this.nome;
    }
}