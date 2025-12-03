import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja();

        int opc = 0;

        while (opc != 5) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Comprar Produto");
            System.out.println("4 - Listar Pedidos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            // TRY 1 — erro de entrada no menu
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue;
            }

            switch (opc) {
                case 1:
                    try { // TRY 2 — erro ao cadastrar produto
                        System.out.print("Nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(sc.nextLine());

                        if (preco < 0) {
                            System.out.println("Preço não pode ser negativo.");
                            break;
                        }

                        Produto p = new Produto(nome, preco);
                        loja.cadastrarProduto(p);
                        System.out.println("Produto cadastrado com sucesso!");

                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar produto. Preço inválido.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Produtos cadastrados ---");
                    for (Produto p : loja.getProdutos()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    try { // TRY 3 — erro ao comprar
                        System.out.print("Nome do produto: ");
                        String nomeProd = sc.nextLine();

                        System.out.print("Nome do cliente: ");
                        String nomeCliente = sc.nextLine();

                        loja.comprarProduto(nomeProd, nomeCliente);

                    } catch (Exception e) {
                        System.out.println("Erro ao processar compra.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Pedidos Realizados ---");
                    for (Pedido ped : loja.getPedidos()) {
                        System.out.println(ped);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
