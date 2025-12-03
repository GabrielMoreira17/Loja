public class Pedido {
    private Cliente cliente;
    private Produto produto;

    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "Pedido: " + cliente.getNome() + " comprou " + produto.getNome();
    }
}
