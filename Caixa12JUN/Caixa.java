
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
    

    // métodos Construtores
    public Caixa(){
        this.altura = 0;
        this.largura = 0;
        this.profundidade = 0;
        this.cor = null;
    }    

    public Caixa (double altura, double largura,  double profundidade, Cor cor) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.cor = cor;
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
    
    public Cor getCor()
    {
        return this.cor;
    }

    public double volume ()
    {
        return this.largura * this.altura * this.profundidade;
    }

    public String toString(){
       return ("\nAltura da caixa: " + this.altura + "\nLargura da caixa: "+ this.largura +  
                "\nProfundidade da caixa: " + this.profundidade + " Cor: " + this.cor);
    }

} // fim da classe
