
/**
 * A classe Caixa é a primeira experiência com a OO.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Caixa
{ 
    // atributos 
    private double largura;
    private double altura;
    private double profundidade;
    private Cor cor;
    private char tamanho;
    

    // métodos Construtores
    public Caixa(){
        this.largura = 0;
        this.altura = 0;
        this.profundidade = 0;
        this.cor = null;
        this.tamanho = 'M'; // tamanho padrao
    }    

    public Caixa (double largura, double altura,  double profundidade, Cor cor, char tamanho) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.cor = cor;
        setTamanho(tamanho);
    }
    
    // métodos setters
    public void setLargura (double largura){
        this.largura = largura;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public void setProfundidade (double profundidade){
        this.profundidade = profundidade;
    }
    
    public void setCor (Cor cor)
    {
        this.cor = cor;
    }
    public void setTamanho (char tamanho){
        if (tamanho == 'P' || tamanho == 'M' || tamanho == 'G'){
            this.tamanho = tamanho;
        } else {
            throw new IllegalArgumentException("Tamanho invalido!! Os unicos tamanhos aceitos sao 'P', 'M' ou 'G'.");
        }
    }
    
    // métodos getters
    public double getLargura (){
        return this.largura;
    }

    public double getAltura (){
        return this.altura;
    }

    public double getProfundidade (){
        return this.profundidade;
    }

    public double volume (){
        return this.largura * this.altura * this.profundidade;
    }
    
    public char getTamanho (){
        return this.tamanho;
    }
    
    public Cor getCor(){
        return this.cor;
    }

    public String toString(){
       return ("\nAltura da caixa: " + this.altura + 
        "\nLargura da caixa: "+ this.largura + 
        "\nProfundidade da caixa: " + this.profundidade + 
        "\nTamanho: " + this.tamanho +
        "\nCor: " + this.cor);
    }

} // fim da classe
