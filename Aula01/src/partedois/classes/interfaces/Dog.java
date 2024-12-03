package partedois.classes.interfaces;

public class Dog implements Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("O " + name + " está comendo");
    }

    @Override
    public void makeSound() {
        System.out.println("O " + name + " está latindo sem parar!");
    }

    @Override
    public void sleep() {
        System.out.println("O" + name + " está dormindo!");
    }
}
