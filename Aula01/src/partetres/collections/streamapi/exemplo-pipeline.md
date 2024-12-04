# Explicação do Código:

## Classe Produto:
- Define as propriedades nome, preco e promocao de um produto.
- Inclui um construtor para inicializar as propriedades.
- Possui métodos getters para acessar as propriedades.

## Método main:
- Cria uma lista de produtos produtos usando Arrays.asList.
- Define a variável mediaPrecoPromocao para armazenar a média do preço dos produtos em promoção.
- Utiliza o pipeline de operações da Stream API para calcular a média:
- filter(p -> p.isPromocao()): Filtra a lista para incluir apenas produtos em promoção (p.isPromocao() == true).
- mapToDouble(Produto::getPreco): Mapeia cada produto para seu preço, convertendo para double.
- average(): Calcula a média dos preços dos produtos na stream.
- orElse(0.0): Retorna o valor da média (se existir) ou 0 caso a lista esteja vazia ou não haja produtos em promoção.
- Imprime a média do preço dos produtos em promoção.

### Observações:
Este código é um exemplo básico e pode ser adaptado para atender às suas necessidades específicas.
Você pode adicionar outras operações intermediárias ao pipeline para realizar processamentos adicionais nos dados.
A Stream API oferece diversas outras funcionalidades que podem ser exploradas para resolver diferentes problemas.