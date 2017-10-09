# Checkout utilizando Design Pattern

Este exemplo foi desenvolvido para fins de estudo e aprendizado sobre Design Patter. 
Para desenvolvimento deste exemplo foi utilizado 4 pattern, foram eles PROXY, COMPOSITE, STRATEGY, CHAIN  OF RESPONSABILITY.
Abaixo encontra-se uma preve descrição de onde foi utilizado os Pattern descritos acima.

## Chekout
O sistema de checkou é a parte que fica após selecionar os itens para o "carrinho" de compras, onde você visualiza o resumo dos itens que selecionou, coloca a quantidade e em seguida efetuar o pagamento através dos meios existentes. (Boleto, Cartão Crédito, Cartão de Debito, Cartão da Loja).
O intuito desse exemplo é mostrar que com poucas linhas é possivel fazer muita coisa e além disso você consegue obter um menor consumo de maquina consequentemente um menor tempo de resposta também.

## Requerimentos
NetBeans 8.2 -> ou superior;
JDK 1.8 -> ou superior;

## Design Pattern Proxy
O PROXY é utilizado como objetivo de encapsular um objeto através de um outro objeto que possui a mesma interface fazendo assim que ele seje chamado antes do objeto real.
Neste exemplo o PROXY foi utilizado para autenticação ou seja antes do usuário acessar a parte de pagamento é validado seu email e senha;

## Design Pattern CHAIN  OF RESPONSABILITY
A CHAIN  OF RESPONSABILITY evita o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação.
No exemplo, foi utilizado para fazer uma busca do email e senha que é pego do Design Pattern citado acima. Ele funciona fazendo uma cadeia de pesquisa onde a primeira busca é feita o MEMCACHE a segunda no REDIS e por final no MONGO (Lembrando que é so mensagens nada implementado de fato).

### Codigo que fo ultizado para rodar no arquivo main. 

```
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

```

