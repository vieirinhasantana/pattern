package trab;
public class ProdutoSimples implements Produto {
    
    private String nome;
    private Double preco;

    public ProdutoSimples (String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
    
}
