# Explicação do código:

## Criando uma lista de números: 
- Uma lista de números inteiros é criada usando a classe Arrays.asList().
## Filtrando números pares: 
- O método filter() é usado para criar uma nova stream contendo apenas os números pares da lista original. 
- O predicado numero -> numero % 2 == 0 verifica se cada número é par.
## Mostrando a lista de números pares: 
- A lista de números pares é coletada em uma nova lista usando o método collect() e impressa no console.
## Mapeando números para seus quadrados: 
- O método map() é usado para criar uma nova stream contendo os quadrados de cada número da lista original. 
- A expressão lambda numero -> numero * numero calcula o quadrado de cada número.
- Mostrando a lista de quadrados: A lista de quadrados é coletada em uma nova lista usando o método collect() e impressa no console.
## Somando os números: 
- O método reduce() é usado para somar todos os números da lista original. 
- O valor inicial do acumulador é 0 e a expressão lambda (acumulador, numero) -> acumulador + numero adiciona cada número ao acumulador.
## Mostrando a soma dos números: 
- A soma dos números é impressa no console.
## Calculando a média dos números: 
- O método mapToDouble() é usado para converter cada número da lista original para um tipo double. O método average() calcula a média dos números e o método getAsDouble() obtém o valor da média como um double.
## Mostrando a média dos números: 
- A média dos números é impressa no console.
### Observações:
Este é apenas um exemplo básico do uso da Stream API em Java. A API oferece uma variedade de outros métodos para processar e transformar streams de dados.
A Stream API é uma ferramenta poderosa para trabalhar com coleções de dados em Java. Ela pode ajudar a escrever código mais conciso, legível e eficiente.