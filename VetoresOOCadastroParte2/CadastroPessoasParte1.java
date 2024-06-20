
/**
 * Escreva uma descrição da classe CadastroPessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CadastroPessoasParte1
{
    private Pessoa vetorPessoas[];
    private int index;

    public CadastroPessoasParte1(int tamanho){
        //criação de vetor de objetos
        this.vetorPessoas = new Pessoa[tamanho];
        this.index = 0;
    }
    //Verifica se há espaço disponível no vetor. 
    //Se houver, o objeto Pessoa é adicionado ao vetor na posição index e esta 
    //é incrementada. Se o vetor estiver cheio retorna false.
    public boolean adicionaNoVetor(Pessoa p1){
        if(this.index >= this.vetorPessoas.length){
            return false;
        } else {
            this.vetorPessoas[this.index] = p1;
            this.index++;
            return true;
        }
    }
    //Percorre o vetor e verifica se o objeto p1 está nele. Se o objeto for 
    //encontrado, o método retorna a posição em que foi encontrado. 
    //Senão retorna -1 para indicar que o objeto não foi encontrado.
     public int localizaPessoa(Pessoa p1) 
     {  int posi = -1;
         for(int i=0; i<this.index; i++)
         {
            if(this.vetorPessoas[i] == p1)
            {
                posi = i;
                break;
            }            
                      
        }
        return posi;
    }
    //mostra o vetor    
    public void imprimeVetor(){
        for(int i = 0; i < this.index; i++)
        {
            System.out.println("\nCadastro de pessoas na posicao " + (i+1)+ 
                               "\n******** ** ******* ** *******");            
            System.out.println(this.vetorPessoas[i].toString());
        }        
    }

    // procura vetor de pessoas p1 e conta quantos salarios são superiores
    // a 30000. O método retorna o valor de conta, que representa 
    //o número total de supersalarios encontrados.
    public int contaSuperSalario(){
        int cont = 0;        
        for(int i=0; i<this.index; i++)
        {
            if(this.vetorPessoas[i].getSalario() > 30000)
            {                
                cont++;
            }
        }
        return cont;
    }
    
    // procura no vetor de pessoas p1 qual o maior salário armazenado.
    // O método retorna o valor do maior salário
    public double maiorSalario(){
        double maiorSalario = 0;        
        for(int i=0; i<this.index; i++)
        {
            if(this.vetorPessoas[i].getSalario() > maiorSalario)
            {
                maiorSalario = this.vetorPessoas[i].getSalario();
            }
        }
        return maiorSalario;
    }
}