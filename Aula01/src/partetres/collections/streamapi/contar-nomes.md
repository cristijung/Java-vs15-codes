# Explicação:

## Importações: 
- Importa as classes Arrays, List, Map, Collectors e Funcionario para auxiliar na manipulação de dados.
## Classe ContarNomes: 
- Define a classe principal que contém o método main.
## Método main:
- Cria uma lista nomes contendo alguns nomes de exemplo.
- Utiliza a Stream API para processar a lista:
  filter(nome -> nome.length() > 5): Filtra a lista para incluir apenas nomes com mais de 5 letras.
- A expressão lambda nome -> nome.length() > 5 verifica se o tamanho (length) do nome é maior que 5.
- count(): Conta o número de elementos no stream filtrado.
- Imprime a contagem de nomes com mais de 5 letras.