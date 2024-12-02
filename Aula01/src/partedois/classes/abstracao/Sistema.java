package partedois.classes.abstracao;

public class Sistema {

    public static void main(String[] args) {
        Dog dog = new Dog("Luke");
        Cat cat = new Cat("Kirara");

        dog.eat();
        dog.makeSound();
        cat.eat();
        cat.makeSound();

    }
}
