
/**
 * 
 * Classe utilizando metodos para calcular dados especificados atraves de um metodo main.
 * 
 * @author (Gustavo Flores) 
 * @version (V 1.0)
 */

public class Biblioteca { // classe  biblioteca que sera utilizada para definir os metodos de formulas.
    public static double areaCirculo (double raio){
        double area;
        area = Math.PI * (raio);
        return area;
    };
    public static double areaRetangulo (double base, double altura){
        double area;
        area = base * altura;
        return area;
    };
    public static double areaQuadrado (double lado){
        double area;
        area = lado * lado;
        return area;
    };
    public static double areaTriangulo (double base, double altura){
        double area;
        area = (base * altura)/2;
        return area;
    };
    public static double perimetroCirculo (double raio){
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    };
    public static double perimetroRetangulo (double base, double altura){
        double perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    };
    public static double perimetroQuadrado (double lado){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    };
    public static double perimetroTriangulo (double lado){
        double perimetro;
        perimetro = 3 * lado;
        return perimetro;
    };
    public static double volumeEsfera (double raio){
        double volume;
        volume = (4.0/3) * Math.PI * (raio * raio * raio); // lembrar sempre do .0 apos o numero dentro de parenteses para identificar como double
        return volume;
    };  
    public static double volumeCilindro (double raio, double altura){
        double volume;
        volume = Math.PI * (raio * raio) * altura;
        return volume;
    };
    public static double volumeCubo (double lado){
        double volume;
        volume = lado * lado * lado;
        return volume;
    };
    
    // metodo booleano com funçao condicional para identificar se o X sera par ou impar
    public static boolean parImpar (int x){
       
        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // metodo booleano com funçao condicional para identificar se o inteiro X eh multiplo do inteiro Y
    public static boolean multiplo (int x, int y){
        if (x % y == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public static double maiorValor (double x, double y, double z){
        if (x >= y && x >= z){
            return x;
        } else if (y >= x && y >= z){
            return y;
        } return z;
    }
}
   

