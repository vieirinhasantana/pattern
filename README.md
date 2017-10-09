# Checkout utilizando Design Pattern

Este exemplo foi desenvolvido para fins de estudo e aprendizado sobre Design Patter. 
Para desenvolvimento deste exemplo foi utilizado 4 pattern, foram eles PROXY, COMPOSITE, STRATEGY, CHAIN  OF RESPONSABILITY.
Abaixo encontra-se uma preve descrição de onde foi utilizado os Pattern descritos acima.

## Chekout
O sistema de checkou é a parte que fica após selecionar os itens para o "carrinho" de compras, onde você visualiza o resumo dos itens que selecionou, coloca a quantidade e em seguida efetuar o pagamento através dos meios existentes. (Boleto, Cartão Crédito, Cartão de Debito, Cartão da Loja).
O intuito desse exemplo é mostrar que com poucas linhas é possivel fazer muita coisa e além disso você consegue obter um menor consumo de maquina consequentemente um menor tempo de resposta também.

### Requerimentos
NetBeans 8.2 -> ou superior;
JDK 1.8 -> ou superior;

### Design Pattern Proxy
O PROXY é utilizado como objetivo de encapsular um objeto através de um outro objeto que possui a mesma interface fazendo assim que ele seje chamado antes do objeto real.
Neste exemplo o PROXY foi utilizado para autenticação ou seja antes do usuário acessar a parte de pagamento é validado seu email e senha;

### Design Pattern CHAIN  OF RESPONSABILITY
A CHAIN  OF RESPONSABILITY evita o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação.
No exemplo, foi utilizado para fazer uma busca do email e senha que é pego do Design Pattern citado acima. Ele funciona fazendo uma cadeia de pesquisa onde a primeira busca é feita o MEMCACHE a segunda no REDIS e por final no MONGO (Lembrando que é so mensagens nada implementado de fato).

### Design Pattern COMPOSITE
A ideia do COMPOSITE é montar uma árvore onde tanto as folhas (objetos individuais) quanto os compostos (grupos de objetos) sejam tratados de maneira igual.
Neste exemplo foi utilziado para montar os produtos, o qual será utilizado no checkout onde temos:

```
produtoC = produtoA + produtoB;
produtoD = produtoC + produtoA;
```
### Design Pattern STRATEGY
O STRATEGY permite que o algoritmo varie independentemente dos clientes que o utilizam além disso é possivel alterar seu comportamento em tempo de excução (Diferencial do STRATEGY para outros pattern).
No exemplo foi aplicado para que o usuário altere a forma de pagamento(Boleto, Cartão Crédito, Cartão de Debito, Cartão da Loja), sem ter que recriar o objeto novamete, o que custaria recurso dempedendo a aplicação.

## Rodando Aplicação
1- Clone o repositório
```
https://github.com/vieirinhasantana/pattern.git
```
2- Abra o projeto utilizando 
```
Ctrl + Shift + O
```
3- Após abrir o projeto va na classe Trab.java; 
Aqui está o main do projeto basta roda e criar combinações como preferir;

### LICENCE
MIT
Daniel Vieira Santana
