package partedois.classes.abstracao;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    //método concreto: é aquele q pode ser implementado
    public void eat() {
        System.out.println(name + " está comendo!");
    }

    //método abstrato
    public abstract void makeSound();
}
