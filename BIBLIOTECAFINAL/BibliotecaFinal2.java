import java.util.Scanner;
public class BibliotecaFinal2 {
    
    // Soma os elementos da diagonal principal de uma matriz quadrada.
    public static int somaDP1For(int matriz[][]) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    // Soma os elementos da diagonal principal de uma matriz quadrada usando um loop adicional.
    public static int somaDP2For(int matriz[][]) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    // Recebe uma matriz, cria um vetor e copia os dados da matriz para o vetor.
    public static int[] criaVetor(int matriz[][]) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int vetor[] = new int[linhas * colunas];
        int indV = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vetor[indV] = matriz[i][j];
                indV++;
            }
        }

        return vetor;
    }

    // Exibe os elementos de um vetor.
    public static void mostraVetor(int vetor[]) {
        System.out.println("mostrando vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    // Lê os elementos de um vetor a partir da entrada do usuário.
    public static void leVetor(String nome, int vetor[], Scanner teclado) {
        System.out.println("Lendo vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }
    }

    // Conta os elementos ímpares que estão abaixo da diagonal principal de uma matriz.
    public static int imparesAbaixoDP(int matriz[][]) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) { // abaixo da DP: linha > coluna
                    if (matriz[i][j] % 2 != 0) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }

    // Conta os elementos pares que estão acima da diagonal principal de uma matriz.
    public static int paresAcimaDP(int matriz[][]) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j > i) { // acima da DP: coluna > linha
                    if (matriz[i][j] % 2 == 0) {
                        cont++;
                    }
                }
            }
        }
        return cont;
    }

    // Cria um vetor onde cada elemento é o produto dos elementos de cada linha da matriz.
    public static int[] vetorProdutoLinhas(int matriz[][]) {
        int produto;
        int vetor[] = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            produto = 1;
            for (int j = 0; j < matriz[i].length; j++) {
                produto *= matriz[i][j];
            }
            vetor[i] = produto;
        }

        return vetor;
    }

    // Cria um vetor onde cada elemento é a soma dos elementos de cada coluna da matriz.
    public static int[] vetorSomaColunas(int matriz[][]) {
        int vetor[] = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                vetor[j] += matriz[i][j]; // índices invertidos para navegar pelas colunas
            }
        }
        return vetor;
    }

    // Conta as linhas nulas (linhas com todos os elementos iguais a zero) em uma matriz.
    public static int linhasNulas(int matriz[][]) {
        int contNulas = 0;
        for (int i = 0; i < matriz.length; i++) {
            boolean nula = true;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    nula = false;
                    break;
                }
            }
            if (nula) {
                contNulas++;
            }
        }
        return contNulas;
    }

    // Conta as colunas nulas (colunas com todos os elementos iguais a zero) em uma matriz.
    public static int colunasNulas(int matriz[][]) {
        int contNulas = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            boolean nula = true;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != 0) { // índices invertidos para navegar pelas colunas
                    nula = false;
                    break;
                }
            }
            if (nula) {
                contNulas++;
            }
        }
        return contNulas;
    }

    // Verifica se existe algum produto de dois elementos do vetor que também esteja no vetor.
    public static boolean existeProduto(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (i != j) {
                    int produto = vetor[i] * vetor[j];
                    for (int k = 0; k < vetor.length; k++) {
                        if (vetor[k] == produto) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // Recebe um vetor e cria uma matriz capaz de armazenar todos os elementos do vetor, 
    // mesmo que sobrem espaços.
    public static int[][] criaMatriz(int vetor[]) {
        int qtdeElementos = vetor.length;

        // Calcula o número de colunas como o próximo inteiro maior ou igual à raiz quadrada
        int colunas = (int) Math.ceil(Math.sqrt(vetor.length));
        // Calcula o número de linhas como o próximo inteiro maior ou igual à divisão da quantidade de elementos pelo número de colunas
        int linhas = (int) Math.ceil((double) vetor.length / colunas);

        System.out.println("Linhas " + linhas + " colunas " + colunas);
        int matriz[][] = new int[linhas][colunas];
        int cont = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (qtdeElementos > 0) {
                    matriz[i][j] = vetor[cont];
                    cont++;
                    qtdeElementos--;
                }
            }
        }

        return matriz;
    }

    // Soma os elementos da diagonal principal de uma matriz quadrada.
    public static int somaDP(int matriz[][]) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }

    // Calcula o produto dos elementos da diagonal secundária de uma matriz quadrada.
    public static int produtoDS(int matriz[][]) {
        int produto = 1;

        for (int i = 0; i < matriz.length; i++) {
            produto *= matriz[i][matriz.length - 1 - i];
        }

        return produto;
    }

    // Troca os elementos da diagonal principal com os da diagonal secundária de uma matriz quadrada.
    public static void troca(int matriz[][]) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = aux;
        }
    }


    // Método que encontra o maior valor da linha com menor valor em uma matriz
    public static int maiorValorLinhaMenor(int matriz[][]) {
        int menor = matriz[0][0];
        int linMenor = 0;
        // Encontra a linha com o menor valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linMenor = i;
                }
            }
        }
        int maior = matriz[linMenor][0];
        // Encontra o maior valor na linha com o menor valor
        for (int j = 1; j < matriz[0].length; j++) {
            if (matriz[linMenor][j] > maior) {
                maior = matriz[linMenor][j];
            }
        }
        return maior;
    }

    // Método que calcula a soma dos elementos abaixo da diagonal principal de uma matriz
    public static int somaAbaixoDP(int matriz[][]) {
        int soma = 0;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    // Método que encontra o maior valor da diagonal secundária de uma matriz
    public static int maiorDS(int matriz[][]) {
        int maior = matriz[0][matriz.length - 1];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][matriz.length - 1 - i] > maior) {
                maior = matriz[i][matriz.length - 1 - i];
            }
        }
        return maior;
    }

    // Método que conta os elementos diferentes de zero acima da diagonal principal de uma matriz
    public static int contaAcimaDP(int matriz[][]) {
        int conta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j && matriz[i][j] != 0) {
                    conta++;
                }
            }
        }
        return conta;
    }

    // Método que calcula a soma dos elementos das colunas ímpares de uma matriz
    public static int somaColunasImpares(int matriz[][]) {
        int soma = 0;
        for (int j = 0; j < matriz[0].length; j += 2) {
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    // Método que mostra o conteúdo da matriz.
    public static void mostraMatriz(int matriz[][]) {
        System.out.println("Mostrando matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
       
