
/**
 * Escreva uma descrição da classe Cor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cor
{
    private String nome;
    private String fornecedor;

    public Cor (String nome, String fornecedor)
    {
       this.nome = nome;
       this.fornecedor = fornecedor;
    }

    // getters
    public String getNome()
    {
        return this.nome;
    }
    public String getFornecedor()
    {
        return this.fornecedor;
    }
    // setters
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public void setFornecedor (String fornecedor)
    {
        this.fornecedor = fornecedor;
    }
    // toString -> estado do objeto
    public String toString()
    {
        return " Nome: " + this.nome + " Fornecedor: " + this.fornecedor;
    }
}
