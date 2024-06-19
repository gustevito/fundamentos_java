public class Pessoa{
    private String nome;
    private int codigo;
    private double salario;

    public Pessoa(String nome, int codigo, double salario){
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCodigo(int codigo){ 
        this.codigo = codigo;
    }
    public int getCodigo(){ 
        return this.codigo;
    }
    public void setSalario(double salario){ 
        this.salario = salario;
    }
    public double getSalario(){ 
        return this.salario;
    }
    public String toString() {
        return "\nNome: " + this.nome + 
        "\nCodigo: " + this.codigo + 
        "\nSalario: " + this.salario;
    }
}