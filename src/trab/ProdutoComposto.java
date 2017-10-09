package trab;

public class ProdutoComposto implements Produto{
    
    private Produto produto1;
    private Produto produto2;
    
    public ProdutoComposto(Produto produto1, Produto produto2) {
        this.produto1 = produto1;
        this.produto2 = produto2;
    }
    
    @Override
    public String getNome() {
        return produto1.getNome()  + " com " + produto2.getNome();
    }

    @Override
    public Double getPreco() {
       return produto1.getPreco() + produto2.getPreco();
    }
    
}
