public class Pessoa{
    private String nome;
    private int codigo;
    private double salario;

    public Pessoa(String nome, int codigo, double salario){
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        
    }
    
    // setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCodigo(int codigo){ 
        this.codigo = codigo;
    }
    
    public void setSalario(double salario){ 
        this.salario = salario;
    }
    
    
    
    // getters
    public String getNome(){
        return this.nome;
    }

    public int getCodigo(){ 
        return this.codigo;
    }

    public double getSalario(){ 
        return this.salario;
    }
    
    
    
    public void aumentoSalarial(){
        if (this.codigo >=1 && this.codigo <=4)
        {
            this.salario = this.salario + ((this.salario*15)/100);
        }
        else
        {
            if (this.codigo >=5 && this.codigo <=9)
            {
                this.salario = this.salario + ((this.salario*20)/100);
            }
            else
            {
                if (this.codigo >=10 && this.codigo <=15)
                {
                    this.salario = this.salario + ((this.salario*25)/100);
                }
            }
        }
    }
    
    // toString
    public String toString() {
        return "\nNome: " + this.nome + 
        "\nCodigo: " + this.codigo + 
        "\nSalario: R$" + this.salario;
    }
}