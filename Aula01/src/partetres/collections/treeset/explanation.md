# Explicação do Código
## Classe Produto:
- Define os atributos codigo, nome, e preco.
- Inclui métodos getters e setters.
- Override de toString(), equals(), e hashCode() para correta manipulação de objetos em coleções.
- Implementa Comparable<Produto> para que os produtos sejam ordenados pelo codigo.
## Classe Main:
- Cria um TreeSet para gerenciar produtos.
- Usa a classe Scanner para obter a entrada do usuário.
- Permite que o usuário adicione produtos, atualize preços, remova produtos e liste todos os produtos.
- Oferece um menu de opções para o usuário interagir com o programa.
- Inclui um método auxiliar encontrarProdutoPorCodigo para encontrar um produto pelo codigo.

### Este exemplo permite que o usuário interaja com o programa através do terminal, adicionando, atualizando, removendo e listando produtos em uma loja.