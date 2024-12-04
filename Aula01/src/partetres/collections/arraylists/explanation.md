# Explicação do Código

## Interface LibraryItem: 
- Define os métodos checkOut(), returnItem(), e getTitle() que devem ser implementados pelas classes que a implementam.

## Classe Book: 
- Implementa a interface LibraryItem e fornece implementações para os métodos checkOut(), returnItem(), e getTitle(). 
- Possui atributos title, author, e isCheckedOut.

## Classe Magazine: 
- Implementa a interface LibraryItem e fornece implementações para os métodos checkOut(), returnItem(), e getTitle(). 
- Possui atributos title, issue, e isCheckedOut.

## Classe Main:
- Cria um ArrayList de LibraryItem.
- Adiciona instâncias de Book e Magazine ao ArrayList.
- Itera sobre o ArrayList e chama os métodos checkOut() e returnItem() para cada LibraryItem.


### Modelo que demonstra como usar a interface LibraryItem com as classes Book e Magazine, 
### separando cada classe em seu próprio arquivo para um melhor gerenciamento do código, e utilizando 
### um ArrayList para gerenciar a coleção de itens da biblioteca.