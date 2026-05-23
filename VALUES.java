package Exercicio2_Sistema_de_Compra_Online_refactor;

import java.util.Scanner;

public class EX_002 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("=== CADASTRO DO PRODUTO ===");

        System.out.print("Nome do produto: ");
        p.nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        p.preco = sc.nextDouble();

        System.out.println();

        p.exibirProduto();

        sc.nextLine();

        CompraOnline compra = new CompraOnline();

        System.out.println("\n=== SISTEMA DE COMPRA ONLINE ===");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Forma de pagamento: ");
        String formaPagamento = sc.nextLine();

        System.out.print("Valor da compra: ");
        double valorCompra = sc.nextDouble();

        CompraOnline compraFinal = new CompraOnline(
                nome,
                cpf,
                endereco,
                formaPagamento,
                valorCompra
        );

        compraFinal.calcularFrete();

        System.out.println("Total da compra: R$" + compraFinal.total);

        System.out.print("Cartão aprovado? (true/false): ");
        compraFinal.cartaoAprovado = sc.nextBoolean();

        compraFinal.finalizarCompra();

        sc.close();
    }
}

