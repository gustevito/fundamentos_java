public class AppCadastro{
    public static void main(String args[]){
        CadastroCaixas lote = new CadastroCaixas(3);
        Caixa c1;
        Cor cor;
        
        c1 = new Caixa (1.0,1.0,1.0, cor = new Cor("vermelha","fornecedor A"));
    
        if(lote.insereCaixa(c1)){
            System.out.println("Inserida com sucesso");
        } else{
            System.out.println("Erro");
        }
    }
}