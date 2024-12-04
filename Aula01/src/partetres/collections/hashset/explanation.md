# Explicação do Código
## Interface LibraryItem: 
- Define os métodos checkOut(), returnItem(), e getTitle() que devem ser implementados pelas classes que a implementam.
## Classe Book: 
- Implementa a interface LibraryItem e fornece implementações para os métodos checkOut(), returnItem(), e getTitle(). 
- Possui atributos title, author, e isCheckedOut. Também sobrescreve os métodos equals() e hashCode() para garantir que HashSet funcione corretamente.
## Classe Magazine: 
- Implementa a interface LibraryItem e fornece implementações para os métodos checkOut(), returnItem(), e getTitle(). 
- Possui atributos title, issue, e isCheckedOut. Também sobrescreve os métodos equals() e hashCode() para garantir que HashSet funcione corretamente.
## Classe Main:
- Cria um HashSet de LibraryItem.
- Adiciona instâncias de Book e Magazine ao HashSet.
- Tenta adicionar um item duplicado e verifica se foi adicionado.
- Itera sobre o HashSet e chama os métodos checkOut() e returnItem() para cada LibraryItem.
- 
### Neste exemplo, a saída no terminal é formatada de forma mais clara e a palavra "issue" não aparece diretamente na mensagem de saída.