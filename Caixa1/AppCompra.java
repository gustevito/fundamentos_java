/**
 * Aluno: Gustavo Fagundes Flores
 * Turma: 12
 * 
 * Espero que goste :)
 */

public class AppCompra {
    public static void main(String[] args) {

        // objetos: clientes
        Cliente cliente1 = new Cliente("Shaolin", "shaolinmatadordeporco@email.com", 1);
        Cliente cliente2 = new Cliente("Flavio", "flavindopneu@email.com", 2);

        // objetos: cores/fornecedores
        Cor cor1 = new Cor("Vermelho", "Fornecedor A");
        Cor cor2 = new Cor("Amarelo", "Fornecedor B");

        // objetos: caixas
        Caixa caixa1 = new Caixa(16.0, 7.0, 3.0, cor1, 'M');
        Caixa caixa2 = new Caixa(8.0, 2.0, 3.0, cor1, 'G');

        // objetos: compras
        Compra compra1 = new Compra(cliente1, caixa1);
        Compra compra2 = new Compra(cliente2, caixa2);

        // exibir informaçoes das compras
        System.out.println("Dados 1ª compra:");
        exibirDadosCompra(compra1);

        System.out.println("\nDados da 2ª compra:");
        exibirDadosCompra(compra2);

        // verificaçao do metodo que compara os tamanhos das caixas
        if (compra1.mesmoTamanho(compra2)) {
            System.out.println("\nAs duas compras foram feitas de caixas de MESMO TAMANHO.");
        } else {
            System.out.println("\nAs duas compras foram feitas de caixas de tamanhos DIFERENTES.");
        }

        // verificaçao do metodo que compara os fornecedores das cores das caixas
        if (compra1.mesmoFornecedor(compra2)) {
            System.out.println("As duas compras possuem O MESMO fornecedor da cor da caixa.");
        } else {
            System.out.println("As duas compras possuem fornecedores DIFERENTES da cor da caixa.");
        }

    }

    // método para exibir os dados de uma compra
    private static void exibirDadosCompra(Compra compra) {
        System.out.println("\nCliente: " + compra.getCliente().getNome());
        System.out.println("E-Mail do cliente: " + compra.getCliente().getEmail());
        System.out.println("Número do Cliente: " + compra.getCliente().getNumero());
        System.out.println("Caixa:");
        System.out.println("  Tamanho: " + compra.getCaixa().getTamanho());
        System.out.println("  Cor: " + compra.getCaixa().getCor().getNome());
        System.out.println("  Fornecedor da Cor: " + compra.getCaixa().getCor().getFornecedor());
    }
}
