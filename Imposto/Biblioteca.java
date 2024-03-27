public class Biblioteca{
    public static double precoQuilo(int codProduto){
        double preco = 0;
        switch (codProduto){
            case 1: case 2: case 3: case 4: preco = 10.00;
            break;
            case 5: case 6: case 7: preco = 25.00;
            break;
            case 8: case 9: case 10: preco = 35.00;
            break;
        }
        return preco;
    }
    
    public static double percImposto(int codContinente){
        double imposto = 0;
        switch (codContinente){
            case 1: imposto = 17;
            break;
            case 2: imposto = 25;
            break;
            case 3: imposto = 12;
            break;
            case 4: imposto = 28;
            break;
            case 5: imposto = 8;
            break;
        }
        return imposto;
    }
}