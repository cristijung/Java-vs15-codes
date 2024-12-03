package partedois.classes.interfaces;

public class Cat implements Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("O " + name + " está comendo");
    }

    @Override
    public void makeSound() {
        System.out.println("O " + name + " está berrando!");
    }

    @Override
    public void sleep() {
        System.out.println("O" + name + " está dormindo!");
    }

}
