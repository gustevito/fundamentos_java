import java.util.Scanner;
public class BibliotecaFinal
{
    public static int somaDP1For (int matriz[][])
    {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
            soma += matriz[i][i];
        }
        return soma;
    }
    public static int somaDP2For (int matriz[][])
    {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                if (i==j) {
                     soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
    // recebe uma matriz, cria um vetor e joga os dados da matriz no vetor
    public static int [] criaVetor (int matriz[][])
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;     
        int vetor [] = new int [linhas*colunas];
        int indV = 0;
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                 vetor[indV] = matriz[i][j];
                 indV++;
            }
        }
        
        return vetor;
    }
    public static void mostraVetor(int vetor[])
    {
        System.out.println ("mostrando vetor: ");
        for (int i = 0; i<vetor.length; i++){
            System.out.print (vetor[i] + " ");
        }
    }
    public static void leVetor (String nome, int vetor[], Scanner teclado)
    {        
        System.out.println ("Lendo vetor:" );
        for (int i = 0; i < vetor.length; i++) 
        {
                vetor[i] = teclado.nextInt();
        }
        
    }
    public static int imparesAbaixoDP (int matriz[][])
    {
        int cont = 0;  
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                if (i > j)  // abaixo da DP linha > coluna
                {
                    if (matriz[i][j] % 2 != 0)
                    {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    public static int paresAcimaDP (int matriz[][])
    {
        int cont = 0;  
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                if (j > i)  // acima da DP coluna > linha
                {
                    if (matriz[i][j] % 2 == 0)
                    {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    public static int[] vetorProdutoLinhas(int matriz[][])
    {
        int produto = 1;
        int vetor[] = new int[matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) 
        {
            produto = 1;
            for (int j = 0; j < matriz[0].length; j++) 
            {
                produto*=matriz[i][j];   
            }
            vetor[i] = produto;
        }
        
        return vetor;
    }
    public static int[] vetorSomaColunas(int matriz[][])
    {
        int soma = 0;
        int vetor[] = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                vetor[i]+=matriz[j][i]; /// INVERTIDOS OS ÍNDICES para navegar nas colunas
            }
        }
        return vetor;
    }
    public static int linhasNulas (int matriz[][])
    {
        int cont, contNulas = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
            cont = 0;
            for (int j = 0; j < matriz[i].length; j++) 
            {
                if (matriz[i][j] == 0)
                {
                    cont++;
                }
            }
            if (cont == matriz[0].length)
            {
                contNulas++;
            }
        }
        return contNulas;
    }
    public static int colunasNulas (int matriz[][])
    {
        int cont, contNulas = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
            cont = 0;
            for (int j = 0; j < matriz[0].length; j++) 
            {
                if (matriz[j][i] == 0)  /// INVERTIDOS OS ÍNDICES para navegar nas colunas
                {
                    cont++;
                }
            }
            if (cont == matriz.length)
            {
                contNulas++;
            }
        }
        return contNulas;
    }
    public static boolean existeProduto (int vetor[])
    {
        int produto = 0;
        for (int i = 0; i < vetor.length; i++) 
        {
            for (int j=0; j<vetor.length;j++)
            {
                for (int k = 0; k < vetor.length; k++)
                {
                    produto = vetor[i] * vetor[j];
                    if (vetor[k] == produto && i!=j)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    // recebe um vetor, cria uma matriz com capacidade para guardar todos os elementos do vetor 
    // na matriz criada
    // aqui se considera que a quantidade de elementos do vetor pode não fechar uma "matriz certinha"
    // então cria-se uma que caiba todos os elementos do vetor, mesmo que sobre espaços na matriz criada
    //
    // calcula o nro de colunas a partir da raiz quadrada, pegando o próximo nro
    // calcula o nro de linhas a partir da qtde de elementos a serem armazenados, dividindo pelo nro de colunas
    // há a possibilidade de ter mais espaços na matriz do que elementos no vetor, por isso
    // a necessidade de controlar a quantidade de elementos do vetor que serão armazenados na matriz.
 
    public static int [][] criaMatriz(int vetor[])
    {
        int qtdeElementos = vetor.length; // guarda qtde de elementos na variável auxiliar
        
        // qtde de colunas é o arredondamento para o próximo valor maior que a raiz quadrada do nro
        // Math.sqrt => retorna um double
        // Math.ceil => recebe um double e devolve um double
        int colunas = (int) Math.ceil(Math.sqrt(vetor.length)); 
        // qtde de linhas é o arredondamento para o próximo valor maior do resultado da divisão
        // da quantidade de elementos pelo número de collunas 
        int linhas = (int) Math.ceil((double) vetor.length / colunas);
        
        System.out.println ("Linhas " + linhas + " colunas  " + colunas);
        int matriz[][] = new int [linhas][colunas];
        int cont = 0;
        
        for(int i = 0; i < linhas; i++)
        {
            for(int j = 0; j < colunas; j++)
            {
                if (qtdeElementos > 0) {  // se ainda tem elemento no vetor, guarda ele
                    matriz[i][j] = vetor[cont]; 
                    cont++;
                    qtdeElementos--;
                }
            }
        }
        
        return matriz;
        
    }
    public static int somaDP (int matriz[][]) 
    {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }

    public static int produtoDS (int matriz[][]) 
    {
        int produto = 1;

        for (int i = 0; i < matriz.length; i++) {
            produto += matriz[i][matriz.length - 1 - i];
        }

        return produto;
    }

    public static void troca (int matriz[][])
    {
        int aux = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = aux;
        }
    }

    public static int maiorValorLinhaMenor (int matriz[][])
    {
        int menor = matriz[0][0];
        int linMenor = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (matriz[i][j] < menor )      
                {
                    menor = matriz[i][j];
                    linMenor = i;
                }
            }
        }
        int maior = matriz[linMenor][0];
        for (int j = 1; j<matriz[0].length; j++)
        {
            if (matriz[linMenor][j] > maior)
            {
                maior = matriz[linMenor][j];
            }
        }
        return maior;
    }
    // escolha 1 => media pares || escolha 2 => media impares
    public static double mediaValores (int matriz[][], int escolha)
    {
        int soma = 0, cont = 0;
        double media = 0;
        if (escolha == 1)
        {
            for (int i = 0; i<matriz.length; i++)
            {
                for (int j= 0; j< matriz[0].length;j++)
                {
                    if (matriz[i][j] % 2 == 0 )
                    {
                        soma += matriz[i][j];
                        cont++;
                    }
                }
            }
            media = (double) soma / cont;
        }
        if (escolha == 2)
        {
            for (int i = 0; i<matriz.length; i++)
            {
                for (int j= 0; j< matriz[0].length;j++)
                {
                    if (matriz[i][j] % 2 != 0 )
                    {
                        soma += matriz[i][j];
                        cont++;
                    }
                }
            }
            media = (double) soma / cont;
        }
        return media;
    }

    public static int prodLinhaPar (int matriz[][])
    {
        int produto = 1;
        for (int i = 0; i<matriz.length; i+=2)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {

                produto *= matriz[i][j];
            }
        }  
        return produto;
    }
    public static int somaLinImpares (int matriz[][])
    {
        int soma = 0;
        for (int i = 1; i<matriz.length; i+=2)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {

                soma += matriz[i][j];
            }
        }  
        return soma;
    }
    public static int somaLinImpColPar (int matriz[][])
    {
        int soma = 0;
        for (int i = 1; i<matriz.length; i+=2)
        {
            for (int j= 0; j< matriz[0].length;j+=2)
            {

                soma += matriz[i][j];
            }
        }
        return soma; 
    }
    public static int produtoLinParColImpar (int matriz[][])
    {
        int produto = 1;
        for (int i = 0; i<matriz.length; i+=2)
        {
            for (int j= 1; j< matriz[0].length;j+=2)
            {

                produto *= matriz[i][j];
            }
        }
        return produto; 
    }       
    public static int contPerfeitos (int matriz[][])
    {
        int contPerfeitos = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (ehNumeroPerfeito(matriz[i][j]))
                {
                    contPerfeitos++;
                }
            }
        }
        return contPerfeitos;
    }

    public static int contPrimos (int matriz[][])
    {
        int contPrimos = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (ehPrimo(matriz[i][j]))
                {
                    contPrimos++;
                }
            }
        }
        return contPrimos;
    }

    public static int contDivi (int matriz[][],int divi )
    {
        int contDiv = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (matriz[i][j] % divi == 0 )
                {
                    contDiv++;
                }
            }
        }
        return contDiv;
    }

    public static int contPares (int matriz[][])
    {
        int contP = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (matriz[i][j] % 2 == 0 )
                {
                    contP++;
                }
 
            }
        }
        return contP;
    }
    public static int contImpares (int matriz[][])
    {
        int contImp = 0;
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                if (matriz[i][j] % 2 != 0 )
                {
                    contImp++;
                }
            }
        }
        return contImp;
    }
    public static void leMatriz (int matriz[][], Scanner teclado)
    {
        for (int i = 0; i<matriz.length; i++)
        {
            for (int j= 0; j< matriz[0].length;j++)
            {
                do {
                    System.out.println ("informe um nro: ");
                    matriz[i][j] = teclado.nextInt();
                } while (matriz[i][j] < 0);
            }
        }
    }

    public static int maximoDivisorProprio(int numero) 
    {
        int mdc = 1;

        for (int i = 1; i <= numero / 2; i++) { // máximo divisor próprio
            System.out.println (" numero " + numero + " i " + i);
            if (numero % i == 0) 
            {
                mdc = i;
                System.out.println (" MDC " + mdc);
            }
        }
        System.out.println (" MDC " + mdc);
        return mdc;
    }

    public static void mostraMatriz (int matriz[][])
    {   
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j=0; j < matriz[i].length; j++)
            {
                System.out.print (matriz[i][j] + " ");
            }
            System.out.println ();
        }
    }

    public static int qtdDivisores(int numero)
    {
        int contD = 0; // conta os divisores
        // analisa todo o intervalo de 1 até o número
        // a variável i assume os valores de 1 até o próprio número
        for (int i = 1; i <= numero; i++){ 
            if (numero % i == 0){
                contD ++;
            }
        }
        return contD;
    }

    public static boolean ehPrimo(int numero)
    {
        if (qtdDivisores(numero) == 2 ) {return true;}
        else {return false;}
    }

    public static boolean ehNumeroPerfeito (int numero)
    {
        int soma = 0;
        // analisa todo o intervalo de 1 até o valor anterior ao número
        // a variável i assume os valores de 1 até o antecessor do número
        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                soma += i; // somatório dos divisores
            }
        }
        if (soma == numero) {return true;}
        else return false;
    }

    public static boolean ehNumeroAbundante (int numero) //numero é a variável definida pelo usuário;
    {
        int soma = 0;
        // analisa todo o intervalo de 1 até o valor anterior ao número
        // a variável i assume os valores de 1 até o antecessor do número
        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                soma += i; // somatório dos divisores
            }
        }
        if (soma > numero) {return true;}
        else return false;
    }

    public static boolean ehNumeroCapicua (int numero) {
        int original = numero;
        int digito, reverso = 0;

        while (numero != 0) {
            //resto inteiro da divisão de um número por 10 vai sobrando 
            //os digitos de tras para frente (quantas dezenas inteiras cabem 
            //no numero e sobra a unidade)
            digito = numero % 10;
            // reverso vai acumulando as dezenas somadas ao digito retirado
            // ou seja, vai montando o numero de tras para frente
            reverso = reverso * 10 + digito;
            // divisao inteira vai tirando os digitos de tras para frente 
            // (quantas dezenas inteiras cabem no numero)
            numero = numero / 10;
        }

        if (original == reverso) { return true; }
        else { return false; }
    }

    public static boolean ehQuadradoPerfeito(int numero) {
        int raiz = (int) Math.sqrt(numero); // Obtém a raiz quadrada do número
        // Verifica se o quadrado da raiz é igual ao número
        if (raiz * raiz == numero) {return true;}
        else { return false;}

    }

    public static boolean saoAmigos(int numero1, int numero2) {
        int soma1 = 0, soma2 = 0;
        // analisa todo o intervalo de 1 até o valor anterior ao número1
        // a variável i assume os valores de 1 até o antecessor do número1
        for (int i = 1; i < numero1; i++){
            if (numero1%i == 0){
                soma1 += i; // somatório dos divisores do número1
            }
        }
        // analisa todo o intervalo de 1 até o valor anterior ao número2
        // a variável i assume os valores de 1 até o antecessor do número2
        for (int i = 1; i < numero2; i++){
            if (numero2%i == 0){
                soma2 += i;  // somatório dos divisores do número2
            }
        }
        if (soma1 == numero2 && soma2 == numero1) { return true;}
        else {return false;}

    }
    public static int terminaComLetra (String vetor[], char letra)
    {
        int cont=0;
        for (int i= 0; i<vetor.length; i++)
        {
            if (vetor[i].charAt(vetor[i].length()-1) == letra)
            {
                cont++;
            }
        }
        return cont;
    }
    public static int comecaComLetra (String vetor[], char letra)
    {
        int cont=0;
        for (int i= 0; i<vetor.length; i++)
        {
            if (vetor[i].charAt(0) == letra)
            {
                cont++;
            }
        }
        return cont;
    }
    public static int tamanhoPar (String vetor[])
    {
        int cont=0, tamanho = 0;
        for (int i= 0; i<vetor.length; i++)
        {
            tamanho = vetor[i].length();
            if (tamanho % 2 == 0)
            {
                cont++;
            }
        }
        return cont;
    }
    public static String maiorNome (String vetor[])
    {
        int maiorTamanho = 0;
        String maiorNome = "";
        for (int i= 0; i<vetor.length; i++)
        {
            if (vetor[i].length() > maiorTamanho)
            {
                maiorTamanho = vetor[i].length();
                maiorNome = vetor[i];
            }
        }
        return maiorNome;
    }
    public static int consoantes(String palavra)
    {
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {
            char letra = palavra.charAt(cont);
            switch (letra)
            {
                case 'a', 'e', 'i', 'o', 'u': break;
                default: total++;
            } 
        }
        return total;
    }
}
