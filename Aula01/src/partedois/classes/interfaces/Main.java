package partedois.classes.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Seth");
        Animal dog = new Dog("Pitty");

        cat.eat();
        cat.makeSound();
        cat.sleep();

        dog.eat();
        dog.makeSound();
        dog.sleep();
    }
}
