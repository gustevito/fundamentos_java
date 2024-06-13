public class Cliente {
    private String nomeCliente;
    private String email;
    private int numero;
    
    public Cliente(){
        this.nomeCliente = null;
        this.email = null;
        this.numero = 0;
    }
    
    public Cliente(String nomeCliente, String email, int numero){
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.numero = numero;
    }

    // getters
    public String getNome(){
        return this.nomeCliente;
    }

    public String getEmail(){
        return this.email;
    }

    public int getNumero() {
        return this.numero;
    }

    // setters
    public void setNome(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
