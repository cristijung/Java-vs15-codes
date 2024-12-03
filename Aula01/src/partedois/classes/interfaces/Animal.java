package partedois.classes.interfaces;
//Interfaces são contratos que especificam quais métodos as classes
//devem implementar
//É uma forma de garantir que diferentes classes tenham um
//comportamento padronizado

public interface Animal {
    //métodos abstratos
    //estes métodos definem que qualquer classe q implementar a interface Animal
    //deve ter estes métodos, q não retornam nenhum valor
    void eat();
    void makeSound();
    void sleep();
}
