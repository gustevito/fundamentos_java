/**
 * Gustavo Flores
 */
import java.util.Arrays;
public class CadastroPessoasParte2
{
    private Pessoa vetorPessoas[];
    private int index;

    public CadastroPessoasParte2(int tamanho){
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
    //remove o objeto Pessoa especificado do vetor. Encontra a posição do 
    //objeto usando o método localizaPessoa(g), desloca todos os elementos 
    //subsequentes uma posição para a esquerda e decrementa o valor de index.
    //Retorna true para indicar que a remoção foi realizada com sucesso.
    public boolean removePessoa(Pessoa p1)
    {
        int posicao= localizaPessoa(p1);
        for(int i = posicao; i < this.index-1; i++)
        {
            this.vetorPessoas[i] = this.vetorPessoas[i+1];
        }
        this.vetorPessoas[this.index-1] = null;      
        this.index--;        
        return true; 
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
    // procura vetor de pessoas a p1, realiza o aumento do seu salário e retorna true
    // se a pessoa não for encontrada, retorna false.
    public boolean aumentaSalario(Pessoa p1){
               
        for(int i=0; i<this.index; i++)
        {
            if (this.vetorPessoas[i] == p1)
            {
                this.vetorPessoas[i].aumentoSalarial();
                return true;
            }
        }
        return false;
        
    }
    public Pessoa menorSalarioPessoa ()
    {
        double menorSalario = this.vetorPessoas[0].getSalario();
        Pessoa pessoaMenorSalario = this.vetorPessoas[0];
        for(int i=1; i<this.index; i++)
        {
            if (this.vetorPessoas[i].getSalario() < menorSalario)
            {
                menorSalario = this.vetorPessoas[i].getSalario();
                pessoaMenorSalario = this.vetorPessoas[i];
            }
        }
        return pessoaMenorSalario;
    }
    
    // ordenação utilizando o método sort da classe Arrays
    public String[] nomesEmOrdem()
    {
        String nomes[] = new String[this.index];
        for(int i=0; i<this.index; i++)
        {
            nomes[i] = this.vetorPessoas[i].getNome();
        }
        Arrays.sort(nomes);
        return nomes;
    }
    
    // ordenação utilizando o método BubbleSort
    public String[] nomesEmOrdemBubble()
    {
        String nomes[] = new String[this.index];
        String aux;
        // primeiro copia para o vetor de nomes os nomes no cadastro
        for(int i=0; i<this.index; i++)
        {
            nomes[i] = this.vetorPessoas[i].getNome();
        }
        // depois ordena com o bubbleSort o vetor de nomes
        for(int i=0; i<this.index; i++)
        {
             for(int j=0; j<this.index-1; j++)
             {
                 if (nomes[j].compareToIgnoreCase(nomes[j+1]) > 0) // string1 > string2
                 {
                    aux = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = aux;
                 }
             }
        }
        return nomes;
    }
    
    // ordenação utilizando o método BubbleSort - um vetor de objetos a partir do atributo nome
    public void nomesEmOrdemBubbleObj()
    {
        Pessoa pessoasObj[]; // cria uma variável de referência local para um vetor de objetos pessoa
        Pessoa aux;          // variável auxiliar para fazer a troca do bubble
        
        pessoasObj = this.vetorPessoas;  // variável auxiliar para o vetor de objetos recebe a referência do objeto original
        // ordena com o bubbleSort o vetor local de pessoas
        for(int i=0; i<this.index; i++)
        {
             for(int j=0; j<this.index-1; j++)
             {
                 if (pessoasObj[j].getNome().compareTo(pessoasObj[j+1].getNome()) > 0) // string1 > string2
                 {
                    aux = pessoasObj[j];
                    pessoasObj[j] = pessoasObj[j+1];
                    pessoasObj[j+1] = aux;
                 }
             }
        }
        // mostra o vetor local ordenado
        for(Pessoa p1 : pessoasObj)
        {
            if (p1 != null) 
            {
              System.out.println(p1);  
            }
            
        }   
    }
}
