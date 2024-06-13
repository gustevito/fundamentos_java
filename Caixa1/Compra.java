public class Compra {
    private Cliente cliente;
    private Caixa caixa;
    
    public Compra(){
        this.cliente = null;
        this.caixa = null;
    }
    
    public Compra(Cliente cliente, Caixa caixa){
        this.cliente = cliente;
        this.caixa = caixa;
    }

    // getters
    public Cliente getCliente(){
        return this.cliente;
    }

    public Caixa getCaixa(){
        return this.caixa;
    }

    // setters
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setCaixa(Caixa caixa){
        this.caixa = caixa;
    }
    
    
    // verificar se as caixas possuem o mesmo tamanho
    public boolean mesmoTamanho(Compra outraCompra) {
        return this.caixa.getTamanho() == outraCompra.getCaixa().getTamanho();
    }

    // verificar se as compra têm o mesmo fornecedor
    public boolean mesmoFornecedor(Compra outraCompra) {
        return this.caixa.getCor().getFornecedor().equals(outraCompra.getCaixa().getCor().getFornecedor());
    }
}
