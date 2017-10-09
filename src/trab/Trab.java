package trab;
public class Trab {
    public static void main(String[] args) {
       Produto liquidificador = new ProdutoSimples("Liquidificador", 29.00);
       Produto batedeira      = new ProdutoSimples("Batedeira", 59.00);
       Produto kitPanela      = new ProdutoSimples("Kit Panela", 299.00);
       Produto promocaoA      = new ProdutoComposto(liquidificador, batedeira);
       Produto promocaoB      = new ProdutoComposto(kitPanela, batedeira);
       Produto promocaoC      = new ProdutoComposto(liquidificador, kitPanela);
       Produto promocaoD      = new ProdutoComposto(liquidificador, promocaoC);
  
       User user = new User("daniel.vieira", "testasdadsae123");
       Authorization auth = new Authorization();
       auth.Authorization(user);
       auth.meioPagamento();
      
    }
}
