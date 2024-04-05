
/**
 * 
 * Classe utilizando metodos para calcular dados especificados atraves de um metodo main.
 * 
 * @authors (Gustavo Flores e Phelippe Genari) 
 * @version (V 1.0)
 */

public class Biblioteca { // classe  biblioteca que sera utilizada para definir os metodos de formulas.
    public static double areaRetangulo (double base, double altura) // metodo para calcular o a area do Retangulo
    {
        double area;
        area = base * altura;
        return area;
    };
    public static double areaQuadrado (double lado) // metodo para calcular o a area do Quadrado
    {
        double area;
        area = lado * lado;
        return area;
    };
    public static double areaTriangulo (double base, double altura) // metodo para calcular o a area do Triangulo
    {
        double area;
        area = (base * altura)/2;
        return area;
    };
    
    public static double calcImposto(double area, double valor, double imposto) // metodo para calcular o imposto
    {
        double valorFinal;
        
        valorFinal = (area * valor) * (imposto/100);
        
        return valorFinal;
    }
}
   

