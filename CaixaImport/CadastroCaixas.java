public class CadastroCaixas{
    private int index;
    private Caixa caixas[]; // [] = variavel de referencia
    
    public CadastroCaixas(int tam){ // variavel que define tamanho do vetor
        this.index = 0;
        this.caixas = new Caixa[tam]; // instancia de objeto de vetor de caixas
    }
    public boolean insereCaixa(Caixa c1){
        if(this.index  < this.caixas.length){
            this.caixas[this.index] = c1;
            this.index++;
            return true;
        } 
        return false;
    }
    
    public void mostraCaixas(){
        for (int i = 0;i<this.index;i++){
            System.out.println(this.caixas[i]);
        }
    }
}