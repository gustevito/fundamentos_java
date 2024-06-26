public class BibliotecaTotal { // classe  biblioteca que sera utilizada para definir os metodos de formulas.
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
    public static boolean numParImpar (int x){
       
        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // metodo booleano com funçao condicional para identificar se o inteiro X eh multiplo do inteiro Y
    public static boolean numMultiplo (int x, int y){
        if (x % y == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // metodo com funçao condicional para identificar o MAIOR dentre os 3 valores declarados
    public static double numMaiorValor (double x, double y, double z){
        if (x >= y && x >= z){
            return x;
        } else if (y >= x && y >= z){
            return y;
        } else return z;
    }    
    
    // metodo com funçao condicional para identificar o MENOR dentre os 3 valores declarados
    public static double numMenorValor (double x, double y, double z){
        if (x <= y && x <= z){
            return x;
        } else if (y <= x && y <= z){
            return y;
        } else return z;
    }
    
    // metodo que identifica o valor INTERMEDIARIO dentre os 3 valores declarados, somando os tres valores e subtraindo o maior e o menor valor;
    public static double numValorIntermediario (double x, double y, double z){
        double intermediario1;
        double intermediario2;
        double maior;
        double menor;
        
        maior = numMaiorValor(x, y, z);
        menor = numMenorValor(x, y, z);
        intermediario1 = (x + y + z) - maior;
        intermediario2 = intermediario1 - menor;
        
        return intermediario2;
    }

    
    /**
     * DIVISORES
     * DIVISORES
     * DIVISORES
     * DIVISORES
     * DIVISORES
     */
    

    public static int qtdeDivisores(int x){
        int qtdD = 0;
        
        for (int cont = 1; cont <= x; cont++){
            if ( x % cont == 0) {
                qtdD++;
            }
        } return qtdD;
    }
    
    public static boolean ehPrimo(int x){ // um numero primo so pode ser divisivel por 2 inteiros: 1, e ele mesmo (qtd. de divisores = 2)
        boolean ehP = false;
        int qtdD = 0;
        
        qtdD = qtdeDivisores(x);
        
        if (qtdD == 2){
            ehP = true;            
        } else{
            ehP = false;
        }
        return ehP;
    }

    public static boolean ehNumeroPerfeito(int x){
        if (x <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma == x;
    }

    public static boolean ehNumeroAbundante(int x){
        if (x <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma > x;
    }
    public static boolean ehCapicua(int x) {
        // conversao do número para uma string para facilitar a análise
        String numStr = String.valueOf(x);
        
        // obter comprimento da string
        int length = numStr.length();
        
        for (int i = 0; i < length / 2; i++) {
            // comparando caracteres correspondentes da esquerda e da direita
            if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
                // se houver uma diferença, não é capicua
                return false;
            }
        }
        return true;
    }
    public static boolean saoAmigos(int x, int y){
            if (x <= 0 && y <= 0){
            return false;
        }
        
        int soma = 0;
        for (int cont = 1; cont < x; cont++){
            if (x % cont == 0){
                soma += cont;
            }
        } return soma == x;
    }
    
    
    /**
     * MULTIPLOS
     * MULTIPLOS
     * MULTIPLOS
     * MULTIPLOS
     */
    
    
    
    public static int qtdeMultiplos(int a, int b){
        int qtdD = 0;

        for (int cont = a; cont < b; cont++){
            if (cont % 3 == 0){
                qtdD++;
            }
        } return qtdD;
    }
    public static int somaDosPares(int a, int b){
        int qtdD = 0;
        
        for (int cont = a; cont < b; cont++){
            if (cont % 2 == 0){
               qtdD += cont; 
            }
        } return qtdD;
    }
}