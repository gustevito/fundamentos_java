
/**
 * 
 * Classe utilizando metodos para calcular dados especificados atraves de um metodo main.
 * 
 * @author (Gustavo Flores) 
 * @version (V 1.0)
 */

import java.util.Scanner;

public class BibliotecaTeste { // classe  biblioteca que sera utilizada para definir os metodos de formulas.
    
    public static void areaCirculo (double raio){
        Scanner input = new Scanner(System.in);
        double area;
        
        System.out.println("=== CALCULE A AREA DO CIRCULO ===");
        System.out.println("Valor do raio: ");
        raio = input.nextDouble();
        
        area = Math.PI * (raio);
        System.out.println("Area do circulo: " + area);
    };
    public double areaRetangulo (double base, double altura){
        double area;
        area = base * altura;
        return area;
    };
    public double areaQuadrado (double lado){
        double area;
        area = lado * lado;
        return area;
    };
    public double areaTriangulo (double base, double altura){
        double area;
        area = (base * altura)/2;
        return area;
    };
    public double perimetroCirculo (double raio){
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    };
    public double perimetroRetangulo (double base, double altura){
        double perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    };
    public double perimetroQuadrado (double lado){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    };
    public double perimetroTriangulo (double lado){
        double perimetro;
        perimetro = 3 * lado;
        return perimetro;
    };
    public double volumeEsfera (double raio){
        double volume;
        volume = (4.0/3) * Math.PI * (raio * raio * raio); // lembrar sempre do .0 apos o numero dentro de parenteses para identificar como double
        return volume;
    };  
    public double volumeCilindro (double raio, double altura){
        double volume;
        volume = Math.PI * (raio * raio) * altura;
        return volume;
    };
    public double volumeCubo (double lado){
        double volume;
        volume = lado * lado * lado;
        return volume;
    };
    
    // metodo booleano com funçao condicional para identificar se o X sera par ou impar
    public boolean numParImpar (int x){
       
        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // metodo booleano com funçao condicional para identificar se o inteiro X eh multiplo do inteiro Y
    public boolean numMultiplo (int x, int y){
        if (x % y == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // metodo com funçao condicional para identificar o MAIOR dentre os 3 valores declarados
    public double numMaiorValor (double x, double y, double z){
        if (x >= y && x >= z){
            return x;
        } else if (y >= x && y >= z){
            return y;
        } else return z;
    }
    
    // metodo com funçao condicional para identificar o MENOR dentre os 3 valores declarados
    public double numMenorValor (double x, double y, double z){
        if (x <= y && x <= z){
            return x;
        } else if (y <= x && y <= z){
            return y;
        } else return z;
    }
    
    // metodo que identifica o valor INTERMEDIARIO dentre os 3 valores declarados, somando os tres valores e subtraindo o maior e o menor valor;
    public double numValorIntermediario (double x, double y, double z){
        double intermediario1, intermediario2, maior, menor;
        
        maior = numMaiorValor(x, y, z);
        menor = numMenorValor(x, y, z);
        intermediario1 = (x + y + z) - maior;
        intermediario2 = intermediario1 - menor;
        
        return intermediario2;
    }
}
   

