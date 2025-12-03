public class Produto {
    private String nome;
    private double preco;
    private boolean vendido;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.vendido = false;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void vender() {
        this.vendido = true;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " - " + (vendido ? "Vendido" : "Disponível");
    }
}
