import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void comprarProduto(String nomeProduto, String nomeCliente) {
        Produto produtoEncontrado = null;

        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        if (produtoEncontrado.isVendido()) {
            System.out.println("Este produto já foi vendido.");
            return;
        }

        // Cliente simples só para registrar o pedido
        Cliente cliente = new Cliente(nomeCliente);

        // Marca o produto como vendido
        produtoEncontrado.vender();

        // Cria o pedido
        Pedido pedido = new Pedido(cliente, produtoEncontrado);
        pedidos.add(pedido);

        System.out.println("Compra realizada com sucesso!");
    }
}
