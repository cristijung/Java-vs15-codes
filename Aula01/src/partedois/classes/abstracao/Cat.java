package partedois.classes.abstracao;
//método abstrato é um método relativo onde o resultado
//é definido a partir da implementação

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Miau!!");
    }
}

