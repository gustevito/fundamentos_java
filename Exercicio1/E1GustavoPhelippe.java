
/**
 * Escreva uma descrição da classe E1GustavoPhelippe aqui.
 * 
 * @authors (Gustavo Flores e Phelippe Genari) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class E1GustavoPhelippe
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        
        // Variável responsável pela seleção de opções dentro do menu
        int codigo;
        
        // Variáveis responsáveis pela atribuição de valores dentro das fórmulas de área
        double base;
        double lado;
        double altura;
        double area;
        
        // Variáveis responsáveis pelo cálculo de imposto pago pelo usuário
        double imposto;
        double valor;
        double valorFinal;
        
        // Menu para o usuário escolher o terreno que ele gostaria de calcular
        System.out.println("Bem vindo usuario, digite o codigo referente ao terreno a ser calculado");
        System.out.println();
        System.out.println("            MENU            ");
        System.out.println();
        System.out.println("    1 - Terreno Retangular  ");
        System.out.println("    2 - Terreno Quadrado    ");
        System.out.println("    3 - Terreno Triangular  ");
        System.out.println();
        
        codigo = teclado.nextInt();
        
        switch (codigo)
        {
            case 1:
                // Atribuição de valor da variável de imposto de acordo com a porcentagem a ser calculada
                imposto = 0.148;
                
                System.out.println("Terreno selecionado: Retangular");
                // Solicitação do valor da base
                System.out.println("Valor da base: ");
                base = teclado.nextDouble();
                // Solicitação do valor da altura
                System.out.println("Valor da altura: ");
                altura = teclado.nextDouble();
                
                // Cálculo da área do retângulo utilizando biblioteca implementada
                area = Biblioteca.areaRetangulo(base,altura);
                System.out.println("Area do retângulo: " + area  + " m²");
                
                // Espaçador de linha
                System.out.println();
                
                // Solicitação do valor do terreno
                System.out.println("Agora, insira o valor do terreno: ");
                valor = teclado.nextDouble();
                
                // Cálculo do imposto sobre o valor da área do terreno
                valorFinal = Biblioteca.calcImposto(area, valor, imposto);
                
                // Amostragem dos valores finais para o usuário
                System.out.println("R$ " + valor + " + " + "R$ " + valorFinal);
                break;
            case 2:
                // Atribuição de valor da variável de imposto de acordo com a porcentagem a ser calculada
                imposto = 0.173;
                
                System.out.println("Terreno selecionado: Quadrado");
                
                // Solicitação do valor do lado
                System.out.println("Valor de um dos lados: ");
                lado = teclado.nextDouble();
                
                // Cálculo da área do retângulo utilizando biblioteca implementada
                area = Biblioteca.areaQuadrado(lado);
                System.out.println("Area do quadrado: " + area  + " m²");
                
                // Espaçador de linha
                System.out.println();
                
                // Solicitação do valor do terreno
                System.out.println("Agora, insira o valor do terreno: ");
                valor = teclado.nextDouble();
                
                // Cálculo do imposto sobre o valor da área do terreno
                valorFinal = Biblioteca.calcImposto(area, valor, imposto);
                
                // Amostragem dos valores finais para o usuário
                System.out.println("R$ " + valor + " + " + "R$ " + valorFinal);
                break;
            case 3:
                // Atribuição de valor da variável de imposto de acordo com a porcentagem a ser calculada
                imposto = 0.198;
                
                System.out.println("Terreno selecionado: Triangular");
                
                // Solicitação da base e altura
                System.out.println("Valor da base: ");
                base = teclado.nextDouble();
                System.out.println("Valor da altura: ");
                altura = teclado.nextDouble();

                // Cálculo da área do retângulo utilizando biblioteca implementada
                area = Biblioteca.areaTriangulo(base,altura);
                System.out.println("Area do triangulo: " + area  + " m²");
                
                System.out.println();
                // Solicitação do valor do terreno
                System.out.println("Agora, insira o valor do terreno: ");
                valor = teclado.nextDouble();
                
                // Cálculo do imposto sobre o valor da área do terreno
                valorFinal = Biblioteca.calcImposto(area, valor, imposto);
                
                // Amostragem dos valores finais para o usuário
                System.out.println("R$ " + valor + " + " + "R$ " + valorFinal);
                break;
            default:
                // Mensagem para caso do usuário digite outro código
                System.out.println("Codigo inválido");
        }
    }
}

